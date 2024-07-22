package com.example.cinema.service.impl;

import com.example.cinema.model.entity.movie.Director;
import com.example.cinema.repository.DirectorRepository;
import com.example.cinema.service.DirectorService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service @AllArgsConstructor public class DirectorServiceImpl implements DirectorService {
    private final DirectorRepository directorRepository;


    @Override
    public List<Director> getAllDirectors() {
        return directorRepository.findAll();
    }
}
