package com.example.spring_boot;

import com.example.spring_boot.domain.Team;
import com.example.spring_boot.domain.TeamRepository;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
@AllArgsConstructor
public class APIs {
    private final Service service;
    @GetMapping("/teams")
    Object teams() {
        List<Team> teams = service.teams();
        return teams;
    }
}
