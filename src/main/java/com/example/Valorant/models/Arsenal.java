package com.example.Valorant.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.hibernate.annotations.Cascade;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "arsenal")
public class Arsenal {

    @Column(name = "Name")
    private String name;

    @Column(name = "Type")
    private String type;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @JsonIgnoreProperties(value = "arsenal")
    @ManyToMany
    @Cascade(org.hibernate.annotations.CascadeType.SAVE_UPDATE)
    @JoinTable(
            name = "agent_arsenal",
            joinColumns = {@JoinColumn(name = "arsenal_id", nullable = false, updatable = false)},
            inverseJoinColumns = {@JoinColumn(name = "agent_id", nullable = false, updatable = false)}
    )
    private List <Agent> agents;

    public Arsenal(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public Arsenal() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
