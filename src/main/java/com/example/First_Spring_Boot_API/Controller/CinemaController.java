package com.example.First_Spring_Boot_API.Controller;

import com.example.First_Spring_Boot_API.Model.Cinema;
import com.example.First_Spring_Boot_API.Repository.CinemaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/cinemas")
public class CinemaController {

    @Autowired
    private CinemaRepository cinemaRepository;

    @GetMapping
    public List<Cinema> getAllCinemas(){
        return cinemaRepository.findAll();
    }

}
