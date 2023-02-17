package com.example.spring_boot.domain;

import org.springframework.data.domain.Example;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TeamRepository extends JpaRepository<Team, String> {
//    @EntityGraph(attributePaths = "users")
    @Override
    List<Team> findAll();
}