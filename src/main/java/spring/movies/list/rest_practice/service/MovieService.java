package spring.movies.list.rest_practice.service;

import spring.movies.list.rest_practice.model.MoviesCreation;

import java.util.List;

public interface MovieService {

    public String createMovie(MoviesCreation moviesCreation);
    public String updateMovie(MoviesCreation moviesCreation);
    public String deleteMovie(String movieId);
    public MoviesCreation getMovie(String movieId);
    public List<MoviesCreation> getAllMovies();
}
