package com.oncoderm.spring.repositories;

import com.oncoderm.spring.domain.usuario.Usuario;
import org.springframework.data.repository.CrudRepository;

public interface IUsuarioRepository extends CrudRepository<Usuario, Integer> {
    Usuario findByEmail(String email);
}
