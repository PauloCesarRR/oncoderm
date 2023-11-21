package com.oncoderm.spring.services.exame;

import com.oncoderm.spring.domain.exame.Exame;
import com.oncoderm.spring.domain.exame.ExameDTO;
import com.oncoderm.spring.factories.UsuarioFactory;
import com.oncoderm.spring.repositories.IExameRepository;
import com.oncoderm.spring.utils.Utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExameService implements IExameService {

    @Autowired
    private UsuarioFactory factory;

    @Autowired
    private IExameRepository repository;

    @Override
    public Exame create(ExameDTO exameDTO) throws Exception {
        return null;
    }

    @Override
    public Exame save(Exame exame) throws Exception {
        return null;
    }

    @Override
    public Exame update(Integer id, ExameDTO exameDTO) throws Exception {
        Exame exame = repository.findById(id).orElse(null);
        if(exame == null) {
            return null;
        }

        Utils.copyNonNullProperties(exameDTO, exame);
        return repository.save(exame);
    }

    @Override
    public Exame getById(Integer id) throws Exception {
        return this.repository.findById(id).orElseThrow(() -> new Exception("Exame não encontrado"));
    }

    @Override
    public List<Exame> getAll() throws Exception {
        return (List<Exame>) this.repository.findAll();
    }

    @Override
    public boolean delete(Integer id) throws Exception {
        Exame exame = repository.findById(id).orElse(null);
        if(exame == null){
            return false;
        } else {
            repository.deleteById(id);
            return true;
        }
    }
}
