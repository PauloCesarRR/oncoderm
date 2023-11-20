package com.oncoderm.spring.factories;

import com.oncoderm.spring.domain.usuario.Usuario;
import com.oncoderm.spring.dtos.UsuarioDTO;
import org.springframework.stereotype.Component;

@Component
public class UsuarioFactory {
    public Usuario create(UsuarioDTO usuarioDTO) {
        Usuario novoUsuario = new Usuario(usuarioDTO);
        return novoUsuario;
    }
}
