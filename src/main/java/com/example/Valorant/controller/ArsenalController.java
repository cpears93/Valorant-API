package com.example.Valorant.controller;

import com.example.Valorant.models.Arsenal;
import com.example.Valorant.repository.ArsenalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ArsenalController {

    @Autowired
    ArsenalRepository arsenalRepository;

    @GetMapping(value = "/arsenal")
    public ResponseEntity<List<Arsenal>> getAllArsenal(){
        return new ResponseEntity<>(arsenalRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping(value = "/arsenal/{id}")
    public ResponseEntity getArsenal(@PathVariable Long id){
        return new ResponseEntity<>(arsenalRepository.findById(id),HttpStatus.OK);
    }

    @PostMapping(value = "/arsenal")
    public ResponseEntity<Arsenal> createArsenal(@RequestBody Arsenal arsenal){
        arsenalRepository.save(arsenal);
        return new ResponseEntity<>(arsenal, HttpStatus.CREATED);
    }

    @PatchMapping(value = "/arsenal/{id}")
    public ResponseEntity<Arsenal> updateArsenal(@RequestBody Arsenal arsenal){
        arsenalRepository.save(arsenal);
        return new ResponseEntity<>(arsenal, HttpStatus.OK);
    }

    @DeleteMapping(value = "/arsenal/{id}")
    public ResponseEntity<Arsenal> deleteArsenal(@PathVariable Long id){
        Arsenal found = arsenalRepository.getOne(id);
        arsenalRepository.delete(found);
        return new ResponseEntity<>(null, HttpStatus.OK);
    }
}
