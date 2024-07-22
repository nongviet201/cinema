package com.example.cinema.rest;

import com.example.cinema.model.entity.movie.Movie;
import com.example.cinema.model.request.UpsertMovieRequest;
import com.example.cinema.service.MovieService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/admin/movies")
public class MovieApi {
    @Autowired
    private MovieService movieService;

    //Tạo Movies
    @PostMapping
    public ResponseEntity<?> createMovie(
        @Valid
        @RequestBody
        UpsertMovieRequest request
    ){
        Movie movie = movieService.createMovie(request);
        return new ResponseEntity<>(movie, HttpStatus.CREATED); //201
    }

}
