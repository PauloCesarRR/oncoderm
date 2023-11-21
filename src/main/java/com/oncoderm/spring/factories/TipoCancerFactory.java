package com.oncoderm.spring.factories;

import com.oncoderm.spring.domain.usuario.Usuario;
import com.oncoderm.spring.domain.usuario.UsuarioDTO;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Component;

@Component
public class TipoCancerFactory {
    public Usuario create(UsuarioDTO data) {
        Usuario novoUsuario = new Usuario(data);
        String encryptedPassword = new BCryptPasswordEncoder().encode(data.senha());
        novoUsuario.setSenha(encryptedPassword);

        return novoUsuario;
    }
}
