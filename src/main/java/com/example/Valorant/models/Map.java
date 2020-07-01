package com.example.Valorant.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "maps")
public class Map {

    @Column(name = "Map Name")
    private String mapName;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @JsonIgnoreProperties(value = "map")
    @OneToMany(mappedBy = "map", fetch = FetchType.LAZY)
    private List<Agent> agents;

    public Map(String mapName) {
        this.mapName = mapName;
    }

    public Map() {
    }

    public String getMapName() {
        return mapName;
    }

    public void setMapName(String mapName) {
        this.mapName = mapName;
    }
}
