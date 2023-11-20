package com.oncoderm.spring.services.usuario;

import com.oncoderm.spring.domain.usuario.Usuario;
import com.oncoderm.spring.dtos.UsuarioDTO;

import java.util.List;

public interface IUsuarioService {
    Usuario create(UsuarioDTO usuariodto) throws Exception;
    Usuario save(Usuario usuario) throws Exception;
    Usuario update(Integer id, UsuarioDTO usuariodto) throws Exception;
    Usuario getById(Integer id) throws Exception;
    List<Usuario> getAll() throws Exception;
    boolean delete(Integer id) throws Exception;
}
