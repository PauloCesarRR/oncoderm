package com.oncoderm.spring.factories;

import com.oncoderm.spring.domain.tipotratamento.TipoTratamento;
import com.oncoderm.spring.domain.tipotratamento.TipoTratamentoDTO;
import org.springframework.stereotype.Component;

@Component
public class TipoTratamentoFactory {
    public TipoTratamento create(TipoTratamentoDTO data) {
        TipoTratamento newTipoTratamento = new TipoTratamento(data);
        return newTipoTratamento;
    }
}
