package com.oncoderm.spring.controllers;

import com.oncoderm.spring.domain.estagio.Estagio;
import com.oncoderm.spring.domain.estagio.EstagioDTO;
import com.oncoderm.spring.services.estagio.IEstagioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/estagio")
public class EstagioController {

    @Autowired
    private IEstagioService service;

    @PostMapping("/")
    public ResponseEntity<?> create(@RequestBody EstagioDTO data) throws Exception {
        Estagio novoEstagio = this.service.create(data);
        return new ResponseEntity<>(novoEstagio, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Estagio> update(@RequestBody EstagioDTO data, @PathVariable Integer id) throws Exception {
        Estagio estagio = this.service.update(id, data);
        return new ResponseEntity<>(estagio, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Estagio> getById(@PathVariable Integer id) throws Exception {
        Estagio estagio = this.service.getById(id);
        return new ResponseEntity<>(estagio, HttpStatus.OK);
    }

    @GetMapping("/")
    public ResponseEntity<List<Estagio>> getAll() throws Exception {
        List<Estagio> estagios = this.service.getAll();
        return new ResponseEntity<>(estagios, HttpStatus.OK);
    }
}
