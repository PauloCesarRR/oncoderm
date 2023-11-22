package com.oncoderm.spring.services.diagnostico;

import com.oncoderm.spring.domain.diagnostico.Diagnostico;
import com.oncoderm.spring.domain.diagnostico.DiagnosticoDTO;
import com.oncoderm.spring.factories.DiagnosticoFactory;
import com.oncoderm.spring.repositories.IDiagnosticoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DiagnosticoService implements IDiagnosticoService {

    @Autowired
    private DiagnosticoFactory factory;

    @Autowired
    private IDiagnosticoRepository repository;

    @Override
    public Diagnostico create(DiagnosticoDTO data) throws Exception {
        Diagnostico diagnostico = factory.create(data);
        return this.save(diagnostico);
    }

    @Override
    public Diagnostico save(Diagnostico data) throws Exception {
        return this.repository.save(data);
    }

    @Override
    public Diagnostico getById(Integer id) throws Exception {
        return this.repository.findById(id).orElseThrow(() -> new Exception("Diagnóstico não encontrado"));
    }

    @Override
    public List<Diagnostico> getAll() throws Exception {
        return (List<Diagnostico>) this.repository.findAll();
    }
}
