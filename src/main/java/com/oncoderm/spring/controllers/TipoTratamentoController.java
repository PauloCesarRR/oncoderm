package com.oncoderm.spring.controllers;

import com.oncoderm.spring.domain.tipotratamento.TipoTratamento;
import com.oncoderm.spring.domain.tipotratamento.TipoTratamentoDTO;
import com.oncoderm.spring.services.tipotratamento.ITipoTratamentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tipotratamento")
public class TipoTratamentoController {

    @Autowired
    private ITipoTratamentoService service;

    @PostMapping("/")
    public ResponseEntity<?> create(@RequestBody TipoTratamentoDTO data) throws Exception {
        TipoTratamento novoTipoTratamento = this.service.create(data);
        return new ResponseEntity<>(novoTipoTratamento, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<TipoTratamento> update(@RequestBody TipoTratamentoDTO data, @PathVariable Integer id) throws Exception {
        TipoTratamento tipoTratamento = this.service.update(id, data);
        return new ResponseEntity<>(tipoTratamento, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<TipoTratamento> getById(@PathVariable Integer id) throws Exception {
        TipoTratamento tipoTratamento = this.service.getById(id);
        return new ResponseEntity<>(tipoTratamento, HttpStatus.OK);
    }

    @GetMapping("/")
    public ResponseEntity<List<TipoTratamento>> getAll() throws Exception {
        List<TipoTratamento> tiposTratamentos = this.service.getAll();
        return new ResponseEntity<>(tiposTratamentos, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable Integer id) throws Exception {
        this.service.delete(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}