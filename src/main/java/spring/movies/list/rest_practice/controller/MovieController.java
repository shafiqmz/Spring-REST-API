package spring.movies.list.rest_practice.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import spring.movies.list.rest_practice.model.MoviesCreation;
import spring.movies.list.rest_practice.service.MovieService;

import java.util.List;

@RestController
@RequestMapping("/movieslist")
public class MovieController {


    MovieService movieService;

    @Autowired

    public MovieController(MovieService movieService) {
        this.movieService = movieService;
    }

    // for returning single entity

    @GetMapping("{movieId}")
    public MoviesCreation getMovieDetails(@PathVariable("movieId") String movieId) {

        return movieService.getMovie(movieId);
    }

    // for returning all entities.

    @GetMapping
    public List<MoviesCreation> getAllMovieDetails() {

        return movieService.getAllMovies();
    }

    @PostMapping
    public String createMovieDetails(@RequestBody MoviesCreation movieslist) {
      movieService.createMovie(movieslist);
        return "Movie Added successfully!";
    }

    @PutMapping("{movieId}")
     public String editMovieDetails(@RequestBody MoviesCreation updatedMovie) {
       movieService.updateMovie(updatedMovie);
       return "Movie updated successfully!!";
    }

    @DeleteMapping("{movieId}")
    public String deleteMovieDetails(@PathVariable("movieId") String movieId) {
        movieService.deleteMovie(movieId);
            return "Movie deleted successfully!";
    }

}
