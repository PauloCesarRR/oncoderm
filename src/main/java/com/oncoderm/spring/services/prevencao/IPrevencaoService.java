package com.oncoderm.spring.services.prevencao;

import com.oncoderm.spring.domain.prevencao.Prevencao;
import com.oncoderm.spring.domain.prevencao.PrevencaoDTO;

import java.util.List;

public interface IPrevencaoService {
    Prevencao create(PrevencaoDTO Prevencaodto) throws Exception;
    Prevencao save(Prevencao Prevencao) throws Exception;
    Prevencao update(Integer id, PrevencaoDTO Prevencaodto) throws Exception;
    Prevencao getById(Integer id) throws Exception;
    List<Prevencao> getAll() throws Exception;
    boolean delete(Integer id) throws Exception;
}
