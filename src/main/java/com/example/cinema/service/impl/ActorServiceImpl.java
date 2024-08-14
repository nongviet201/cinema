package com.example.cinema.service.impl;

import com.example.cinema.entity.movie.Actor;
import com.example.cinema.repository.ActorRepository;
import com.example.cinema.service.ActorService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service @AllArgsConstructor public class ActorServiceImpl implements ActorService {
    private final ActorRepository actorRepository;

    @Override
    public List<Actor> getAllActors() {
        return actorRepository.findAll();
    }
}
