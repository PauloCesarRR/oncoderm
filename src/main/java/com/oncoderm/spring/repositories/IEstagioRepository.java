package com.oncoderm.spring.repositories;

import com.oncoderm.spring.domain.estagio.Estagio;
import org.springframework.data.repository.CrudRepository;

public interface IEstagioRepository extends CrudRepository<Estagio, Integer> {
}
