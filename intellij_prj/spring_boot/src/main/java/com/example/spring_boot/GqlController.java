package com.example.spring_boot;

import com.example.spring_boot.domain.Team;
import com.example.spring_boot.domain.User;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
@AllArgsConstructor
public class GqlController {
    final Service service;
    @QueryMapping
    List<Team> teams(){
        return service.teams();
    }
}
