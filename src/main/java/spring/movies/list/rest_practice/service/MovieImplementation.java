package spring.movies.list.rest_practice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import spring.movies.list.rest_practice.model.MoviesCreation;
import spring.movies.list.rest_practice.repository.MovieRepository;

import java.util.List;

@Service

public class MovieImplementation implements MovieService {

    MovieRepository movieRepository;


    @Autowired
    public MovieImplementation(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }


    @Override
    public String createMovie(MoviesCreation moviesCreation) {
        movieRepository.save(moviesCreation);
        return "Movie Added!";
    }

    @Override
    public String updateMovie(MoviesCreation moviesCreation) {
        if (movieRepository.existsById(moviesCreation.getMovieId())) {
            movieRepository.save(moviesCreation);
            return "Movie Updated!";
        }
        return "Movie Not Found!";
    }

    @Override
    public String deleteMovie(String movieId) {
        if (movieRepository.existsById(movieId)) {
            movieRepository.deleteById(movieId);
            return movieId + "Movie Deleted";
        }
        return "Movie Not Found!";
    }

    @Override
    public MoviesCreation getMovie(String movieId) {
        return movieRepository.findById(movieId)
                .orElseThrow(() -> new RuntimeException("Movie not found!"));
    }

    @Override
    public List<MoviesCreation> getAllMovies() {
        return movieRepository.findAll();
    }
}
