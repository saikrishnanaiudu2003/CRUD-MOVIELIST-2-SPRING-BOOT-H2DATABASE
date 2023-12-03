package com.example.movie.repository;

import com.example.movie.model.Movie;
import java.util.*;

public interface MovieRepository {
    ArrayList<Movie> getMovies();

    Movie addMovies(Movie movie);

    Movie getMovieById(int movieId);

    Movie updateMovieById(int movieId, Movie movie);

    void deleteById(int movieId);
}