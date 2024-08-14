package com.example.cinema.service;

import com.example.cinema.entity.cinema.Showtime;

import java.util.List;

public interface ShowtimeService {
    List<Showtime> getShowtimeByMovieIdAndCityId(int movieId, int cityId);
}
