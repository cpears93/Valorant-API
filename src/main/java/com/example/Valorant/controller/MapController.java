package com.example.Valorant.controller;

import com.example.Valorant.models.Map;
import com.example.Valorant.repository.MapRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MapController {

    @Autowired
    MapRepository mapRepository;

    @GetMapping(value = "/maps/{id}")
    public ResponseEntity getMap(@PathVariable Long id){
        return new ResponseEntity<>(mapRepository.findById(id), HttpStatus.OK);
    }

    @GetMapping(value = "/maps")
    public ResponseEntity<List<Map>> getAllMaps(){
        return new ResponseEntity<>(mapRepository.findAll(), HttpStatus.OK);
    }

    @PostMapping(value = "/maps")
    public ResponseEntity<Map> createMap(@RequestBody Map map){
        mapRepository.save(map);
        return new ResponseEntity<>(map, HttpStatus.OK);
    }

    @PatchMapping(value = "/maps/{id}")
    public ResponseEntity<Map> updateMap(@RequestBody Map map){
        mapRepository.save(map);
        return new ResponseEntity<>(map, HttpStatus.OK);
    }

    @DeleteMapping(value = "/maps/{id}")
    public ResponseEntity<Map> deleteMap(@PathVariable Long id){
        Map found = mapRepository.getOne(id);
        mapRepository.delete(found);
        return new ResponseEntity<>(null, HttpStatus.OK);
    }
}
