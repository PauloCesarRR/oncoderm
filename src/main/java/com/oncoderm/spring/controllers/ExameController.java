package com.oncoderm.spring.controllers;

import com.oncoderm.spring.domain.exame.Exame;
import com.oncoderm.spring.domain.exame.ExameDTO;
import com.oncoderm.spring.services.exame.IExameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/exame")
public class ExameController {

    @Autowired
    private IExameService service;

    @PostMapping("/")
    public ResponseEntity<?> create(@RequestBody ExameDTO data) throws Exception {
        Exame novoExame = this.service.create(data);
        return new ResponseEntity<>(novoExame, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Exame> update(@RequestBody ExameDTO data, @PathVariable Integer id) throws Exception {
        Exame exame = this.service.update(id, data);
        return new ResponseEntity<>(exame, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Exame> getById(@PathVariable Integer id) throws Exception {
        Exame exame = this.service.getById(id);
        return new ResponseEntity<>(exame, HttpStatus.OK);
    }

    @GetMapping("/")
    public ResponseEntity<List<Exame>> getAll() throws Exception {
        List<Exame> exames = this.service.getAll();
        return new ResponseEntity<>(exames, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable Integer id) throws Exception {
        this.service.delete(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
