package com.movies.service;

import com.movies.entity.Movie;
import com.movies.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovieService {

    @Autowired
    private MovieRepository repository;

    public List<Movie> findAllMovies() {
        return repository.findAll();
    }
    public Movie findMovieByImdbId(String imdbId) {
        return repository.findMovieByImdbId(imdbId).orElse(new Movie());
    }
}