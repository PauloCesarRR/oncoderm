package com.oncoderm.spring.repositories;

import com.oncoderm.spring.domain.diagnostico.Diagnostico;
import org.springframework.data.repository.CrudRepository;

public interface IDiagnosticoRepository extends CrudRepository<Diagnostico, Integer> {
}
