package com.oncoderm.spring.repositories;

import com.oncoderm.spring.domain.prevencao.Prevencao;
import org.springframework.data.repository.CrudRepository;

public interface IPrevencaoRepository extends CrudRepository<Prevencao, Integer> {
}
