package com.oncoderm.spring.factories;

import com.oncoderm.spring.domain.estagio.Estagio;
import com.oncoderm.spring.domain.estagio.EstagioDTO;

import org.springframework.stereotype.Component;

@Component
public class EstagioFactory {
    public Estagio create(EstagioDTO data) {
        Estagio novoEstagio = new Estagio(data);
        return novoEstagio;
    }
}
