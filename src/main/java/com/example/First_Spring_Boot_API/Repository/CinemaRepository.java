package com.example.First_Spring_Boot_API.Repository;

import com.example.First_Spring_Boot_API.Model.Cinema;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CinemaRepository extends JpaRepository<Cinema,Long> {

}
