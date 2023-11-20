package com.oncoderm.spring.controllers;

import com.oncoderm.spring.domain.usuario.Usuario;
import com.oncoderm.spring.dtos.UsuarioDTO;
import com.oncoderm.spring.services.usuario.IUsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {

    @SuppressWarnings("SpringJavaAutowiredFieldsWarningInspection")
    @Autowired
    private IUsuarioService service;

    @PostMapping("/")
    public ResponseEntity<?> create(@RequestBody UsuarioDTO usuarioDTO) throws Exception {
        Usuario novoUsuario = this.service.create(usuarioDTO);
        return new ResponseEntity<>(novoUsuario, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Usuario> update(@RequestBody UsuarioDTO usuarioDTO, @PathVariable Integer id) throws Exception {
        Usuario usuario = this.service.update(id, usuarioDTO);
        return new ResponseEntity<>(usuario, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Usuario> getById(@PathVariable Integer id) throws Exception {
        Usuario usuario = this.service.getById(id);
        return new ResponseEntity<>(usuario, HttpStatus.OK);
    }

    @GetMapping("/")
    public ResponseEntity<List<Usuario>> getAll() throws Exception {
        List<Usuario> usuarios = this.service.getAll();
        return new ResponseEntity<>(usuarios, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable Integer id) throws Exception {
        this.service.delete(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
