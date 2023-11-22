package com.oncoderm.spring.factories;

import com.oncoderm.spring.domain.exame.Exame;
import com.oncoderm.spring.domain.exame.ExameDTO;
import org.springframework.stereotype.Component;

@Component
public class ExameFactory {
    public Exame create(ExameDTO data) {
        Exame novoExame = new Exame(data);
        return novoExame;
    }
}
