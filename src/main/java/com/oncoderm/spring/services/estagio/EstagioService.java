package com.oncoderm.spring.services.estagio;

import com.oncoderm.spring.domain.estagio.Estagio;
import com.oncoderm.spring.domain.estagio.EstagioDTO;
import com.oncoderm.spring.factories.EstagioFactory;
import com.oncoderm.spring.repositories.IEstagioRepository;
import com.oncoderm.spring.utils.Utils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EstagioService implements IEstagioService {

    @Autowired
    private EstagioFactory factory;

    @Autowired
    private IEstagioRepository repository;

    @Override
    public Estagio getById(Integer id) throws Exception {
        return this.repository.findById(id).orElseThrow(() -> new Exception("Usuário não encontrado"));
    }

    @Override
    public List<Estagio> getAll() throws Exception {
        return (List<Estagio>) this.repository.findAll();
    }

    @Override
    public Estagio create(EstagioDTO data) throws Exception {
        Estagio estagio = factory.create(data);
        return this.save(estagio);
    }

    @Override
    public Estagio save(Estagio estagio) throws Exception {
        return this.repository.save(estagio);
    }

    @Override
    public Estagio update(Integer id, EstagioDTO data) throws Exception {
        Estagio estagio = repository.findById(id).orElse(null);
        if(estagio == null) {
            return null;
        }

        Utils.copyNonNullProperties(data, estagio);
        return repository.save(estagio);
    }

}
