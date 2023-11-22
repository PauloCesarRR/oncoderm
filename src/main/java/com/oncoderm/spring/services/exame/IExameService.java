package com.oncoderm.spring.services.exame;

import com.oncoderm.spring.domain.exame.Exame;
import com.oncoderm.spring.domain.exame.ExameDTO;

import java.util.List;

public interface IExameService {
    Exame create(ExameDTO data) throws Exception;
    Exame save(Exame exame) throws Exception;
    Exame update(Integer id, ExameDTO data) throws Exception;
    Exame getById(Integer id) throws Exception;
    List<Exame> getAll() throws Exception;
    boolean delete(Integer id) throws Exception;
}
