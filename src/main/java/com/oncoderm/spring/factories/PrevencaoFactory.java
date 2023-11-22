package com.oncoderm.spring.factories;

import com.oncoderm.spring.domain.prevencao.Prevencao;
import com.oncoderm.spring.domain.prevencao.PrevencaoDTO;
import org.springframework.stereotype.Component;

@Component
public class PrevencaoFactory {
    public Prevencao create(PrevencaoDTO data) {
        Prevencao newPrevencao = new Prevencao(data);
        return newPrevencao;
    }
}
