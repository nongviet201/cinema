package com.example.cinema.service.impl;

import com.example.cinema.model.entity.cinema.Auditorium;
import com.example.cinema.model.entity.cinema.Cinema;
import com.example.cinema.model.entity.cinema.Showtime;
import com.example.cinema.repository.AuditoriumRepository;
import com.example.cinema.repository.CinemaRepository;
import com.example.cinema.repository.ShowtimeRepository;
import com.example.cinema.service.ShowtimeService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class ShowtimeServiceImpl implements ShowtimeService {
    private final ShowtimeRepository showtimeRepository;
    private final CinemaRepository cinemaRepository;
    private final AuditoriumRepository auditoriumRepository;

    @Override
    public List<Showtime> getShowtimeByMovieIdAndCityId(int movieId, int cityId) {
        // Tìm kiếm danh sách rạp chiếu phim trong thành phố có cityId
        List<Cinema> cinemas = cinemaRepository.findAllByCity_Id(cityId);

        // Lấy danh sách tất cả các phòng chiếu của các rạp tương ứng
        List<Integer> cinemaIds = cinemas.stream().map(Cinema::getId).collect(Collectors.toList());
        List<Auditorium> auditoriums = auditoriumRepository.findAllByCinema_IdIn(cinemaIds);

        // Lấy danh sách các suất chiếu của phim có movieId và nằm trong các phòng chiếu đã lấy
        List<Integer> auditoriumIds = auditoriums.stream().map(Auditorium::getId).collect(Collectors.toList());
        List<Showtime> showtimes = showtimeRepository.findAllByMovie_IdAndAuditorium_IdIn(movieId, auditoriumIds);

        return showtimes;
    }
}
