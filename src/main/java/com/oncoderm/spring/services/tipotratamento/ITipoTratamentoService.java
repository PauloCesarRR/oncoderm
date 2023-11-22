package com.oncoderm.spring.services.tipotratamento;

import com.oncoderm.spring.domain.tipotratamento.TipoTratamento;
import com.oncoderm.spring.domain.tipotratamento.TipoTratamentoDTO;

import java.util.List;

public interface ITipoTratamentoService {
    TipoTratamento create(TipoTratamentoDTO data) throws Exception;
    TipoTratamento save(TipoTratamento tipoTratamento) throws Exception;
    TipoTratamento update(Integer id, TipoTratamentoDTO data) throws Exception;
    TipoTratamento getById(Integer id) throws Exception;
    List<TipoTratamento> getAll() throws Exception;
    boolean delete(Integer id) throws Exception;
}
