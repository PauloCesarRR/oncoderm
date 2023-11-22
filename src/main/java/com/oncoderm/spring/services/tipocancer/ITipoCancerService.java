package com.oncoderm.spring.services.tipocancer;

import com.oncoderm.spring.domain.tipocancer.TipoCancer;

import java.util.List;

public interface ITipoCancerService {
    TipoCancer getById(Integer id) throws Exception;
    List<TipoCancer> getAll() throws Exception;
}
