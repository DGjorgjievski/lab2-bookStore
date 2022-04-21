package com.example.bookstore.controller;

import com.example.bookstore.entity.Country;
import com.example.bookstore.service.CountryService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CountryController {

    private CountryService countryService;

    public CountryController(CountryService countryService) {
        this.countryService = countryService;
    }

    @GetMapping("/api/countries")
    public List<Country> findAll() {
        return countryService.findAll();
    }
}
