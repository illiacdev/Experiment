package com.example.spring_boot.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Data;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

@Data
@Entity
public class Team {
    @Id
    String name;

    @OneToMany
    List<User> users = new ArrayList<>();
}
