package com.oncoderm.spring.repositories;

import com.oncoderm.spring.domain.exame.Exame;
import org.springframework.data.repository.CrudRepository;

public interface IExameRepository extends CrudRepository<Exame, Integer> {
}
