package com.oncoderm.spring.repositories;

import com.oncoderm.spring.domain.tipocancer.TipoCancer;
import org.springframework.data.repository.CrudRepository;

public interface ITipoCancerRepository extends CrudRepository<TipoCancer, Integer> {
}
