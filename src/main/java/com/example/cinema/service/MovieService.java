package com.example.cinema.service;

import com.example.cinema.entity.movie.Movie;
import com.example.cinema.model.request.UpsertMovieRequest;

import java.util.List;

public interface MovieService {
    Movie createMovie(UpsertMovieRequest movieRequest);

    List<Movie> getAllPublishMoviesOrderByReleaseDate();
    List<Movie> getAll();
    Movie getPublishMovieBySlug(String slug);
    Movie findById(int id);
}
