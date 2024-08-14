package com.example.cinema.repository;

import com.example.cinema.entity.cinema.Auditorium;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AuditoriumRepository extends JpaRepository<Auditorium, Integer> {
    Auditorium findById(int id);

    List<Auditorium> findAllByCinema_Id(Integer cinemaIds);
}
