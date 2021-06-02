package com.example.liquibasedemo.repository;

import com.example.liquibasedemo.entity.Pokemon;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Pokedex extends JpaRepository<Pokemon, Long> {
}
