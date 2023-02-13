package com.example.spring_boot.graphql;


import org.springframework.graphql.data.method.annotation.QueryMapping;

import java.time.LocalDateTime;

@org.springframework.stereotype.Controller
public class ControllerExample {
    @QueryMapping
    LocalDateTime serverTime() {
        return LocalDateTime.now();
    }
}
