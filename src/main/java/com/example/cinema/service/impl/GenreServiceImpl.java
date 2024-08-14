package com.example.cinema.service.impl;

import com.example.cinema.entity.movie.Genre;
import com.example.cinema.repository.GenreRepository;
import com.example.cinema.service.GenreService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class GenreServiceImpl implements GenreService {
    private final GenreRepository genreRepository;

    @Override
    public List<Genre> getAllGenres() {
        return genreRepository.findAll();
    }
}
