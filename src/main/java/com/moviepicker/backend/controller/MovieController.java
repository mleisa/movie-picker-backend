package com.moviepicker.backend.controller;

import com.moviepicker.backend.entity.Genre;
import com.moviepicker.backend.entity.Movie;
import com.moviepicker.backend.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
@CrossOrigin()
public class MovieController {

    @Autowired
    private MovieRepository movieRepository;

    @GetMapping("/movies")
    public List<Movie> fetchMovies() {
        return this.movieRepository.findAll();
    }

    @GetMapping("/genres")
    public List<Genre> fetchGenres() {
        return Arrays.asList(Genre.values());
    }

    @PostMapping("/movies")
    public Movie save(@RequestBody Movie updatedMovie) {
        Movie movie = new Movie(updatedMovie.getId(), updatedMovie.getTitle(), updatedMovie.getGenre(), updatedMovie.getSummary(), updatedMovie.getRating());

        return this.movieRepository.save(movie);
    }

    @PatchMapping("/movies/{movieID}")
    public void patch(@PathVariable("movieID") int id, @RequestBody Movie movie) {
        this.movieRepository.findById(id).map(movieEntry -> {
            movieEntry.setRating(movie.getRating());
            return this.movieRepository.save(movieEntry);
        });
    }

    @PutMapping("/movies/{movieID}")
    public void put(@PathVariable("movieID") int id, @RequestBody Movie movie) {
        this.movieRepository.findById(id).map(movieEntry -> {
            movieEntry.setTitle(movie.getTitle());
            movieEntry.setSummary(movie.getSummary());
            movieEntry.setGenre(movie.getGenre());
            movieEntry.setRating(movie.getRating());
            return this.movieRepository.save(movieEntry);
        });
    }

    @DeleteMapping("/movies/{movieID}")
    public void delete(@PathVariable("movieID") int id) {
        this.movieRepository.deleteById(id);
    }



}
