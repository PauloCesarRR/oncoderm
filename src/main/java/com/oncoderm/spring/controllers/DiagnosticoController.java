package com.oncoderm.spring.controllers;

import com.oncoderm.spring.domain.diagnostico.Diagnostico;
import com.oncoderm.spring.domain.diagnostico.DiagnosticoDTO;
import com.oncoderm.spring.services.diagnostico.IDiagnosticoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/diagnostico")
public class DiagnosticoController {

    @Autowired
    private IDiagnosticoService service;

    @PostMapping("/")
    public ResponseEntity<?> create(@RequestBody DiagnosticoDTO data) throws Exception {
        Diagnostico novoDiagnostico = this.service.create(data);
        return new ResponseEntity<>(novoDiagnostico, HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Diagnostico> getById(@PathVariable Integer id) throws Exception {
        Diagnostico diagnostico = this.service.getById(id);
        return new ResponseEntity<>(diagnostico, HttpStatus.OK);
    }

    @GetMapping("/")
    public ResponseEntity<List<Diagnostico>> getAll() throws Exception {
        List<Diagnostico> diagnosticos = this.service.getAll();
        return new ResponseEntity<>(diagnosticos, HttpStatus.OK);
    }
}
