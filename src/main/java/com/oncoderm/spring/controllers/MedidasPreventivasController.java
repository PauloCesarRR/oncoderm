package com.oncoderm.spring.controllers;

import com.oncoderm.spring.domain.medidaspreventivas.MedidasPreventivas;
import com.oncoderm.spring.domain.medidaspreventivas.MedidasPreventivasDTO;
import com.oncoderm.spring.services.medidaspreventivas.IMedidasPreventivasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/medidas")
public class MedidasPreventivasController {

    @Autowired
    private IMedidasPreventivasService service;

    @PostMapping("/")
    public ResponseEntity<?> create(@RequestBody MedidasPreventivasDTO data) throws Exception {
        MedidasPreventivas novaMedidaPreventiva = this.service.create(data);
        return new ResponseEntity<>(novaMedidaPreventiva, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<MedidasPreventivas> update(@RequestBody MedidasPreventivasDTO data, @PathVariable Integer id) throws Exception {
        MedidasPreventivas medidaPreventiva = this.service.update(id, data);
        return new ResponseEntity<>(medidaPreventiva, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<MedidasPreventivas> getById(@PathVariable Integer id) throws Exception {
        MedidasPreventivas medidaPreventiva = this.service.getById(id);
        return new ResponseEntity<>(medidaPreventiva, HttpStatus.OK);
    }

    @GetMapping("/")
    public ResponseEntity<List<MedidasPreventivas>> getAll() throws Exception {
        List<MedidasPreventivas> medidasPreventivas = this.service.getAll();
        return new ResponseEntity<>(medidasPreventivas, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable Integer id) throws Exception {
        this.service.delete(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
