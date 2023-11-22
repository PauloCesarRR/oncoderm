package com.oncoderm.spring.services.tipocancer;

import com.oncoderm.spring.domain.tipocancer.TipoCancer;
import com.oncoderm.spring.repositories.ITipoCancerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TipoCancerService implements ITipoCancerService {

    @Autowired
    private ITipoCancerRepository repository;

    @Override
    public TipoCancer getById(Integer id) throws Exception {
        return this.repository.findById(id).orElseThrow(() -> new Exception("Usuário não encontrado"));
    }

    @Override
    public List<TipoCancer> getAll() throws Exception {
        return (List<TipoCancer>) this.repository.findAll();
    }

}
