package com.example.First_Spring_Boot_API.Controller;

import com.example.First_Spring_Boot_API.Exceptions.ResourceNotFoundException;
import com.example.First_Spring_Boot_API.Model.Cinema;
import com.example.First_Spring_Boot_API.Repository.CinemaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/cinemas")
public class CinemaController {

    @Autowired
    private CinemaRepository cinemaRepository;

    @GetMapping
    public List<Cinema> getAllCinemas(){
        return cinemaRepository.findAll();
    }
    @PostMapping
    public Cinema createCinema(@RequestBody Cinema cinema){
        return cinemaRepository.save(cinema);
    }

    @GetMapping("{id}")
    public ResponseEntity<Cinema> getCinemaById(@PathVariable long id){
        Cinema cinema = cinemaRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Cinema with id" + id + "was not found"));
        return ResponseEntity.ok(cinema);
    }

    @PutMapping("{id}")
    public ResponseEntity<Cinema> updatecinema(@PathVariable long id,@RequestBody Cinema cinemadetails){
        Cinema updatedcinema = cinemaRepository.findById(id).orElseThrow(()-> new ResourceNotFoundException("The cinema with this id does not exist"));

        updatedcinema.setNum_visitors(cinemadetails.getNum_visitors());
        updatedcinema.setCity(cinemadetails.getCity());

        return ResponseEntity.ok(updatedcinema);
    }
   @DeleteMapping("{id}")
    public ResponseEntity<Cinema> deletecinema(@PathVariable long id){
        Cinema deletedcinema = cinemaRepository.findById(id).orElseThrow(()-> new ResourceNotFoundException("Cinema was not fount"));

        cinemaRepository.delete(deletedcinema);

        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
   }
}
