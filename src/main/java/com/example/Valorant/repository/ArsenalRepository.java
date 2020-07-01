package com.example.Valorant.repository;

import com.example.Valorant.models.Arsenal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ArsenalRepository extends JpaRepository<Arsenal, Long> {

    List<Arsenal> findByName(String name);
    List<Arsenal> findByType(String type);
}
