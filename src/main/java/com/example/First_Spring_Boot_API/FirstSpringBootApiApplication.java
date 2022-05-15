package com.example.First_Spring_Boot_API;

import com.example.First_Spring_Boot_API.Model.Cinema;
import com.example.First_Spring_Boot_API.Repository.CinemaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FirstSpringBootApiApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(FirstSpringBootApiApplication.class, args);
	}

	@Autowired
	private CinemaRepository cinemaRepository;


	@Override
	public void run(String... args) throws Exception {
		Cinema village = new Cinema();
		village.setCity("Thessaloniki");
		village.setName("Village Cinemas");
		village.setNum_visitors(125);

		Cinema ster = new Cinema();
		village.setCity("Thessaloniki");
		village.setName("Ster Cinemas");
		village.setNum_visitors(100);

		Cinema odeon = new Cinema();
		village.setCity("Thessalonik");
		village.setName("Odeon Cinemas");
		village.setNum_visitors(80);
	}
}
