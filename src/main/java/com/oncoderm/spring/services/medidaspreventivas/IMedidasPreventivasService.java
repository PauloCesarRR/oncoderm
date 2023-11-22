package com.oncoderm.spring.services.medidaspreventivas;

import com.oncoderm.spring.domain.medidaspreventivas.MedidasPreventivas;
import com.oncoderm.spring.domain.medidaspreventivas.MedidasPreventivasDTO;

import java.util.List;

public interface IMedidasPreventivasService {
    MedidasPreventivas create(MedidasPreventivasDTO MedidasPreventivasdto) throws Exception;
    MedidasPreventivas save(MedidasPreventivas MedidasPreventivas) throws Exception;
    MedidasPreventivas update(Integer id, MedidasPreventivasDTO MedidasPreventivasdto) throws Exception;
    MedidasPreventivas getById(Integer id) throws Exception;
    List<MedidasPreventivas> getAll() throws Exception;
    boolean delete(Integer id) throws Exception;
}
