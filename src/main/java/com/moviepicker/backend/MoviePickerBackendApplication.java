package com.moviepicker.backend;

import com.moviepicker.backend.entity.Genre;
import com.moviepicker.backend.entity.Movie;
import com.moviepicker.backend.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MoviePickerBackendApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(MoviePickerBackendApplication.class, args);
	}

	@Autowired
	private MovieRepository movieRepository;

	@Override
	public void run(String... args) throws Exception {
		Movie movie1 = Movie.builder()
				.title("The Hunger Games")
				.genreList(Genre.Action)
				.rating(4.2)
				.build();

		Movie movie2 = Movie.builder()
				.title("The Hunger Games 2: Catching Fire")
				.genreList(Genre.Action)
				.rating(5.0)
				.build();

		Movie movie3 = Movie.builder()
				.title("The Hunger Games 3: Mockingjay")
				.genreList(Genre.Action)
				.rating(4.5)
				.build();

		movieRepository.save(movie1);
		movieRepository.save(movie2);
		movieRepository.save(movie3);
	}
}
