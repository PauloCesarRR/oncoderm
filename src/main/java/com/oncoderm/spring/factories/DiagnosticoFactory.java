package com.oncoderm.spring.factories;

import com.oncoderm.spring.domain.diagnostico.Diagnostico;
import com.oncoderm.spring.domain.diagnostico.DiagnosticoDTO;
import org.springframework.stereotype.Component;

@Component
public class DiagnosticoFactory {
    public Diagnostico create(DiagnosticoDTO data) {
        Diagnostico novodiagnostico = new Diagnostico(data);

        return novodiagnostico;
    }
}
