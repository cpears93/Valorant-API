package com.example.Valorant.repository;

import com.example.Valorant.models.Map;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MapRepository extends JpaRepository<Map, Long> {

    List<Map> findByMap(String map);
}
