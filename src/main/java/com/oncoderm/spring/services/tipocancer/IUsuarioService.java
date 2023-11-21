package com.oncoderm.spring.services.tipocancer;

import com.oncoderm.spring.domain.usuario.Usuario;
import com.oncoderm.spring.domain.usuario.UsuarioDTO;

import java.util.List;

public interface IUsuarioService {
    Usuario create(UsuarioDTO usuariodto) throws Exception;
    Usuario save(Usuario usuario) throws Exception;
    Usuario update(Integer id, UsuarioDTO usuariodto) throws Exception;
    Usuario getById(Integer id) throws Exception;

    Usuario getByEmail(String email) throws Exception;

    List<Usuario> getAll() throws Exception;
    boolean delete(Integer id) throws Exception;
}
