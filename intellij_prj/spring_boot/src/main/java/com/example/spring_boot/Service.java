package com.example.spring_boot;

import com.example.spring_boot.domain.Team;
import com.example.spring_boot.domain.TeamRepository;
import com.example.spring_boot.domain.User;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;

import java.util.List;

@org.springframework.stereotype.Service
@AllArgsConstructor
public class Service {
    final TeamRepository teamRepository;

    @Transactional
    public List<Team> teams() {
        TeamRepository teamRepository1 = teamRepository;
        List<Team> all = teamRepository1.findAll();
        return all;
    }
}
