package com.oncoderm.spring.services.tipotratamento;

import com.oncoderm.spring.domain.tipotratamento.TipoTratamento;
import com.oncoderm.spring.domain.tipotratamento.TipoTratamentoDTO;
import com.oncoderm.spring.factories.TipoTratamentoFactory;
import com.oncoderm.spring.repositories.ITipoTratamentoRepository;
import com.oncoderm.spring.utils.Utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TipoTratamentoService implements ITipoTratamentoService {

    @Autowired
    private TipoTratamentoFactory factory;

    @Autowired
    private ITipoTratamentoRepository repository;

    @Override
    public TipoTratamento create(TipoTratamentoDTO data) throws Exception {
        TipoTratamento tipoTratamento = factory.create(data);
        return this.save(tipoTratamento);
    }

    @Override
    public TipoTratamento save(TipoTratamento TipoTratamento) throws Exception {
        return this.repository.save(TipoTratamento);
    }

    @Override
    public TipoTratamento update(Integer id, TipoTratamentoDTO data) throws Exception {
        TipoTratamento tipoTratamento = repository.findById(id).orElse(null);
        if(tipoTratamento == null) {
            return null;
        }

        Utils.copyNonNullProperties(data, tipoTratamento);
        return repository.save(tipoTratamento);
    }

    @Override
    public TipoTratamento getById(Integer id) throws Exception {
        return this.repository.findById(id).orElseThrow(() -> new Exception("Usuário não encontrado"));
    }

    @Override
    public List<TipoTratamento> getAll() throws Exception {
        return (List<TipoTratamento>) this.repository.findAll();
    }

    @Override
    public boolean delete(Integer id) throws Exception {
        TipoTratamento tipoTratamento = repository.findById(id).orElse(null);
        if(tipoTratamento == null){
            return false;
        } else {
            repository.deleteById(id);
            return true;
        }
    }
}
