package com.oncoderm.spring.services.diagnostico;

import com.oncoderm.spring.domain.diagnostico.Diagnostico;
import com.oncoderm.spring.domain.diagnostico.DiagnosticoDTO;

import java.util.List;

public interface IDiagnosticoService {
    Diagnostico create(DiagnosticoDTO data) throws Exception;
    Diagnostico save(Diagnostico data) throws Exception;
    Diagnostico getById(Integer id) throws Exception;
    List<Diagnostico> getAll() throws Exception;
}
