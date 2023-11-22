package com.oncoderm.spring.controllers;

import com.oncoderm.spring.domain.prevencao.Prevencao;
import com.oncoderm.spring.domain.prevencao.PrevencaoDTO;
import com.oncoderm.spring.services.prevencao.IPrevencaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/prevencao")
public class PrevencaoController {

    @Autowired
    private IPrevencaoService service;

    @PostMapping("/")
    public ResponseEntity<?> create(@RequestBody PrevencaoDTO data) throws Exception {
        Prevencao novaPrevencao = this.service.create(data);
        return new ResponseEntity<>(novaPrevencao, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Prevencao> update(@RequestBody PrevencaoDTO data, @PathVariable Integer id) throws Exception {
        Prevencao prevencao = this.service.update(id, data);
        return new ResponseEntity<>(prevencao, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Prevencao> getById(@PathVariable Integer id) throws Exception {
        Prevencao prevencao = this.service.getById(id);
        return new ResponseEntity<>(prevencao, HttpStatus.OK);
    }

    @GetMapping("/")
    public ResponseEntity<List<Prevencao>> getAll() throws Exception {
        List<Prevencao> prevencoes = this.service.getAll();
        return new ResponseEntity<>(prevencoes, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable Integer id) throws Exception {
        this.service.delete(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}