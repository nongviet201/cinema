package com.example.cinema.service.impl;

import com.example.cinema.model.entity.movie.Country;
import com.example.cinema.repository.CountryRepository;
import com.example.cinema.service.CountryService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service @AllArgsConstructor public class CountryServiceImpl implements CountryService {
    private final CountryRepository countryRepository;

    @Override
    public List<Country> getAllCountries() {
        return countryRepository.findAll();
    }
}
