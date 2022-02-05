package com.moviepicker.backend.controller;

import com.moviepicker.backend.entity.Genre;
import com.moviepicker.backend.entity.Movie;
import com.moviepicker.backend.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin()
public class MovieController {

    @Autowired
    private MovieRepository movieRepository;

    @GetMapping("/movies")
    public List<Movie> fetchMovies() {
        return movieRepository.findAll();
    }

    @GetMapping("/genres")
    public List<Genre> fetchGenres() {
        return Arrays.asList(Genre.values());
    }

    @PostMapping("/movies")
    public Movie save(@RequestBody Movie updatedMovie) {
        Movie movie = new Movie(updatedMovie.getId(), updatedMovie.getTitle(), updatedMovie.getGenre(), updatedMovie.getSummary(), updatedMovie.getRating());

        return movieRepository.save(movie);
    }

    @DeleteMapping("/movies/{movieID}")
    public void delete(@PathVariable("movieID") int id) {
        movieRepository.deleteById(id);
    }



}
