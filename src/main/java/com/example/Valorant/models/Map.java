package com.example.Valorant.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "maps")
public class Map {

    @Column(name = "name")
    private String name;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @JsonIgnoreProperties(value = "map")
    @OneToMany(mappedBy = "map", fetch = FetchType.LAZY)
    private List<com.example.Valorant.models.Agent> agents;

    public Map(String name) {
        this.name = name;
        this.agents = new ArrayList<Agent>();
    }

    public Map() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Agent> getAgents() {
        return agents;
    }

    public void setAgents(List<Agent> agents) {
        this.agents = agents;
    }
}
