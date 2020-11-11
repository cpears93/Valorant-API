package com.example.Valorant.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.hibernate.annotations.Cascade;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "agents")
public class Agent {

    @Column(name = "name")
    private String name;

    @Column(name = "role")
    private String role;

    @Column(name = "specialAbilityQ")
    private String specialAbilityQ;

    @Column(name = "specialAbilityE")
    private String specialAbilityE;

    @Column(name = "specialAbilityC")
    private String specialAbilityC;

    @Column(name = "specialAbilityX")
    private String specialAbilityX;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @JsonIgnoreProperties(value="agents")
    @ManyToOne
    @JoinColumn(name = "map_id", nullable = false)
    private Map map;

    @JsonIgnoreProperties(value="agents")
    @ManyToMany
    @Cascade(org.hibernate.annotations.CascadeType.SAVE_UPDATE)
    @JoinTable(
            joinColumns = {@JoinColumn(name = "agent_id", nullable = false, updatable = false)},
            inverseJoinColumns = {@JoinColumn(name = "arsenal_id", nullable = false, updatable = false)}
    )
    private List<Arsenal> arsenal;

    public Agent(String name, String role, String specialAbilityQ, String specialAbilityE, String specialAbilityC, String specialAbilityX) {
        this.name = name;
        this.role = role;
        this.specialAbilityQ = specialAbilityQ;
        this.specialAbilityE = specialAbilityE;
        this.specialAbilityC = specialAbilityC;
        this.specialAbilityX = specialAbilityX;
    }

    public Agent() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getSpecialAbilityQ() {
        return specialAbilityQ;
    }

    public void setSpecialAbilityQ(String specialAbilityQ) {
        this.specialAbilityQ = specialAbilityQ;
    }

    public String getSpecialAbilityE() {
        return specialAbilityE;
    }

    public void setSpecialAbilityE(String specialAbilityE) {
        this.specialAbilityE = specialAbilityE;
    }

    public String getSpecialAbilityC() {
        return specialAbilityC;
    }

    public void setSpecialAbilityC(String specialAbilityC) {
        this.specialAbilityC = specialAbilityC;
    }

    public String getSpecialAbilityX() {
        return specialAbilityX;
    }

    public void setSpecialAbilityX(String specialAbilityX) {
        this.specialAbilityX = specialAbilityX;
    }

    public Map getMap() {
        return map;
    }

    public void setMap(Map map) {
        this.map = map;
    }

    public List<Arsenal> getArsenal() {
        return arsenal;
    }

    public void setArsenal(List<Arsenal> arsenal) {
        this.arsenal = arsenal;
    }
}
