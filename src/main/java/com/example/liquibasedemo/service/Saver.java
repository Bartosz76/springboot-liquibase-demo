package com.example.liquibasedemo.service;

import com.example.liquibasedemo.entity.Pokemon;
import com.example.liquibasedemo.repository.Pokedex;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class Saver {

    private Pokedex pokedex;

    @Autowired
    public Saver(Pokedex pokedex) {
        this.pokedex = pokedex;
    }

    @EventListener(ApplicationReadyEvent.class)
    public void initialPokedexInsertion() {
        pokedex.save(new Pokemon("Cubone"));
    }
}
