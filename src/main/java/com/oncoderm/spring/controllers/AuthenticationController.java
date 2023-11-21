package com.oncoderm.spring.controllers;

import com.oncoderm.spring.domain.usuario.AuthDTO;
import com.oncoderm.spring.domain.usuario.LoginResponseDTO;
import com.oncoderm.spring.domain.usuario.Usuario;
import com.oncoderm.spring.domain.usuario.UsuarioDTO;
import com.oncoderm.spring.infra.security.TokenService;
import com.oncoderm.spring.services.usuario.IUsuarioService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
public class AuthenticationController {

    @Autowired
    IUsuarioService service;

    @Autowired
    AuthenticationManager authenticationManager;

    @Autowired
    TokenService tokenService;

    @PostMapping("/login")
    public ResponseEntity login(@RequestBody @Valid AuthDTO data){
        var usernamePassword = new UsernamePasswordAuthenticationToken(data.email(), data.senha());
        var auth = this.authenticationManager.authenticate(usernamePassword);

        var token = tokenService.generateToken((Usuario) auth.getPrincipal());

        return ResponseEntity.ok(new LoginResponseDTO(token));
    }

    @PostMapping("/register")
    public ResponseEntity register(@RequestBody @Valid UsuarioDTO data) throws Exception{
        if(this.service.getByEmail(data.email()) != null) return ResponseEntity.badRequest().build();

        this.service.create(data);

        return ResponseEntity.ok().build();

    }

}
