package com.example.movie.controller;

import com.example.movie.model.Movie;
import com.example.movie.service.MovieH2Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
public class MovieController {
    @Autowired
    public MovieH2Service movieService;

    @GetMapping("/movies")
    public ArrayList<Movie> getMovies() {
        return movieService.getMovies();
    }

    @PostMapping("/movies")
    public Movie addMovies(@RequestBody Movie movie) {
        return movieService.addMovies(movie);
    }

    @GetMapping("/movies/{movieId}")
    public Movie getMovieById(@PathVariable("movieId") int movieId) {
        return movieService.getMovieById(movieId);
    }

    @PutMapping("/movies/{movieId}")
    public Movie updateMovieById(@PathVariable("movieId") int movieId, @RequestBody Movie movie) {
        return movieService.updateMovieById(movieId, movie);
    }

    @DeleteMapping("/movies/{movieId}")
    public void deleteById(@PathVariable("movieId") int movieId) {
        movieService.deleteById(movieId);
    }
}