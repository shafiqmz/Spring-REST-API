package spring.movies.list.rest_practice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import spring.movies.list.rest_practice.model.MoviesCreation;

public interface MovieRepository extends JpaRepository<MoviesCreation, String> {
}
