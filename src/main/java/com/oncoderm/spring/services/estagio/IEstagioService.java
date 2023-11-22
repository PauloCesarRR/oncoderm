package com.oncoderm.spring.services.estagio;


import java.util.List;

import com.oncoderm.spring.domain.estagio.Estagio;
import com.oncoderm.spring.domain.estagio.EstagioDTO;

public interface IEstagioService {
    Estagio create(EstagioDTO data) throws Exception;
    Estagio save(Estagio Estagio) throws Exception;
    Estagio update(Integer id, EstagioDTO data) throws Exception;
    Estagio getById(Integer id) throws Exception;
    List<Estagio> getAll() throws Exception;
}
