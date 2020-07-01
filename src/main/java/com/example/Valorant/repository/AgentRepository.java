package com.example.Valorant.repository;

import com.example.Valorant.models.Agent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AgentRepository extends JpaRepository<Agent, Long> {

    List<Agent> findByName(String name);
    List<Agent> findByRole(String role);
    List<Agent> findBySpecialAbilityQ(String specialAbilityQ);
    List<Agent> findBySpecialAbilityE(String specialAbilityE);
    List<Agent> findBySpecialAbilityC(String specialAbilityC);
    List<Agent> findBySpecialAbilityX(String specialAbilityX);
}
