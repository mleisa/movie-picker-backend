package com.moviepicker.backend.repository;

import com.moviepicker.backend.entity.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository extends JpaRepository<Movie, Integer> {

}
