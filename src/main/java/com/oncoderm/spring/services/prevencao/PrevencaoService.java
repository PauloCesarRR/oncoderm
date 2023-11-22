package com.oncoderm.spring.services.prevencao;

import com.oncoderm.spring.domain.prevencao.Prevencao;
import com.oncoderm.spring.domain.prevencao.PrevencaoDTO;
import com.oncoderm.spring.factories.PrevencaoFactory;
import com.oncoderm.spring.repositories.IPrevencaoRepository;
import com.oncoderm.spring.utils.Utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PrevencaoService implements IPrevencaoService {

    @Autowired
    private PrevencaoFactory factory;

    @Autowired
    private IPrevencaoRepository repository;

    @Override
    public Prevencao create(PrevencaoDTO data) throws Exception {
        Prevencao prevencao = factory.create(data);
        return this.save(prevencao);
    }

    @Override
    public Prevencao save(Prevencao prevencao) throws Exception {
        return this.repository.save(prevencao);
    }

    @Override
    public Prevencao update(Integer id, PrevencaoDTO data) throws Exception {
        Prevencao prevencao = repository.findById(id).orElse(null);
        if(prevencao == null) {
            return null;
        }

        Utils.copyNonNullProperties(data, prevencao);
        return repository.save(prevencao);
    }

    @Override
    public Prevencao getById(Integer id) throws Exception {
        return this.repository.findById(id).orElseThrow(() -> new Exception("Usuário não encontrado"));
    }

    @Override
    public List<Prevencao> getAll() throws Exception {
        return (List<Prevencao>) this.repository.findAll();
    }

    @Override
    public boolean delete(Integer id) throws Exception {
        Prevencao prevencao = repository.findById(id).orElse(null);
        if(prevencao == null){
            return false;
        } else {
            repository.deleteById(id);
            return true;
        }
    }
}
