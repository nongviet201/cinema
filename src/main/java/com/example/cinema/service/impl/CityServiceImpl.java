package com.example.cinema.service.impl;

import com.example.cinema.model.entity.cinema.City;
import com.example.cinema.repository.CityRepository;
import com.example.cinema.service.CityService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@AllArgsConstructor
public class CityServiceImpl implements CityService {
    private final CityRepository cityRepository;
    @Override
    public List<City> getAllCities() {
        return cityRepository.findAll();
    }
}
