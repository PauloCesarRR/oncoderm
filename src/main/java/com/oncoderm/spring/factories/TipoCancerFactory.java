package com.oncoderm.spring.factories;

import com.oncoderm.spring.domain.tipocancer.TipoCancer;
import com.oncoderm.spring.domain.tipocancer.TipoCancerDTO;
import org.springframework.stereotype.Component;

@Component
public class TipoCancerFactory {
    public TipoCancer create(TipoCancerDTO data) {
        TipoCancer newTipoCancer = new TipoCancer(data);
        return newTipoCancer;
    }
}
