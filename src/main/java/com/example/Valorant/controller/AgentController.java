package com.example.Valorant.controller;

import com.example.Valorant.models.Agent;
import com.example.Valorant.repository.AgentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AgentController {

    @Autowired
    AgentRepository agentRepository;

    @GetMapping(value = "/agents")
    public ResponseEntity<List<Agent>> getAllAgents(){
        return new ResponseEntity<>(agentRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping(value = "/agents{id}")
    public ResponseEntity getAgent(@PathVariable Long id){
        return new ResponseEntity<>(agentRepository.findById(id), HttpStatus.OK);
    }

    @PostMapping(value = "/agents")
    public ResponseEntity<Agent> postAgent(@RequestBody Agent agent){
        agentRepository.save(agent);
        return new ResponseEntity<>(agent, HttpStatus.CREATED);
    }

    @PatchMapping(value = "/agents/{id}")
    public ResponseEntity<Agent> updateAgent(@RequestBody Agent agent){
        agentRepository.save(agent);
        return new ResponseEntity<>(agent, HttpStatus.OK);
    }

    @DeleteMapping(value = "/agents/{id}")
    public ResponseEntity<Agent> deleteAgent(@PathVariable Long id){
        Agent found = agentRepository.getOne(id);
        agentRepository.delete(found);
        return new ResponseEntity<>(null, HttpStatus.OK);
    }
}
