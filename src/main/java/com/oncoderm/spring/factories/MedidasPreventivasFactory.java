package com.oncoderm.spring.factories;

import com.oncoderm.spring.domain.medidaspreventivas.MedidasPreventivas;
import com.oncoderm.spring.domain.medidaspreventivas.MedidasPreventivasDTO;
import org.springframework.stereotype.Component;

@Component
public class MedidasPreventivasFactory {
    public MedidasPreventivas create(MedidasPreventivasDTO data) {
        MedidasPreventivas newMedidasPreventivas = new MedidasPreventivas(data);
        return newMedidasPreventivas;
    }
}
