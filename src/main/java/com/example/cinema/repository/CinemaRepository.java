package com.example.cinema.repository;

import com.example.cinema.model.entity.cinema.Cinema;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CinemaRepository extends JpaRepository<Cinema, Long> {
    Cinema findById(int id);

    List<Cinema> findAllByCity_Id(int cityId);
}
