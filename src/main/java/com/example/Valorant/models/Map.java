package com.example.Valorant.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.hibernate.annotations.Cascade;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "maps")
public class Map {

    @Column(name = "Name")
    private String name;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @JsonIgnoreProperties(value = "map")
    @OneToMany(mappedBy = "map", fetch = FetchType.LAZY)
    private List<com.example.Valorant.models.Agent> agents;

    public Map(String name) {
        this.name = name;
    }

    public Map() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<com.example.Valorant.models.Agent> getAgent(){
        return agents;
    }

    public void setAgents(List<com.example.Valorant.models.Agent> agents) {
        this.agents = agents;
    }

    public void addAgents(com.example.Valorant.models.Agent agent){
        this.agents.add(agent);
    }


}
