package com.example.Valorant.repository;

import com.example.Valorant.models.Arsenal;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ArsenalRepository extends JpaRepository<Arsenal, Long> {

    List<Arsenal> findByName(String name);
    List<Arsenal> findByType(String type);
}
