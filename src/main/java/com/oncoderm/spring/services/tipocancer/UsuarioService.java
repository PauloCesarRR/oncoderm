package com.oncoderm.spring.services.tipocancer;

import com.oncoderm.spring.domain.usuario.Usuario;
import com.oncoderm.spring.domain.usuario.UsuarioDTO;
import com.oncoderm.spring.factories.UsuarioFactory;
import com.oncoderm.spring.repositories.IUsuarioRepository;
import com.oncoderm.spring.utils.Utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService implements IUsuarioService {

    @Autowired
    private UsuarioFactory factory;

    @Autowired
    private IUsuarioRepository repository;

    @Override
    public Usuario create(UsuarioDTO usuariodto) throws Exception {
        Usuario usuario = factory.create(usuariodto);
        usuario = this.save(usuario);
        return usuario;
    }

    @Override
    public Usuario save(Usuario usuario) throws Exception {
        return this.repository.save(usuario);
    }

    @Override
    public Usuario update(Integer id, UsuarioDTO usuariodto) throws Exception {
        Usuario usuario = repository.findById(id).orElse(null);
        if(usuario == null) {
            return null;
        }

        Utils.copyNonNullProperties(usuariodto, usuario);
        return repository.save(usuario);
    }

    @Override
    public Usuario getById(Integer id) throws Exception {
        return this.repository.findById(id).orElseThrow(() -> new Exception("Usuário não encontrado"));
    }

    @Override
    public Usuario getByEmail(String email) throws Exception {
        return this.repository.findByEmail(email);
    }

    @Override
    public List<Usuario> getAll() throws Exception {
        return (List<Usuario>) this.repository.findAll();
    }

    @Override
    public boolean delete(Integer id) throws Exception {
        Usuario usuario = repository.findById(id).orElse(null);
        if(usuario == null){
            return false;
        } else {
            repository.deleteById(id);
            return true;
        }
    }
}
