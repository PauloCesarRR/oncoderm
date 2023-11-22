package com.oncoderm.spring.controllers;

import com.oncoderm.spring.domain.tipocancer.TipoCancer;
import com.oncoderm.spring.services.tipocancer.ITipoCancerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tipocancer")
public class TipoCancerController {

    @Autowired
    private ITipoCancerService service;

    @GetMapping("/{id}")
    public ResponseEntity<TipoCancer> getById(@PathVariable Integer id) throws Exception {
        TipoCancer TipoCancer = this.service.getById(id);
        return new ResponseEntity<>(TipoCancer, HttpStatus.OK);
    }

    @GetMapping("/")
    public ResponseEntity<List<TipoCancer>> getAll() throws Exception {
        List<TipoCancer> prevencoes = this.service.getAll();
        return new ResponseEntity<>(prevencoes, HttpStatus.OK);
    }
}