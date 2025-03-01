package spring.movies.list.rest_practice.model;


import jakarta.persistence.*;
import lombok.*;
@Entity
@Table(name = "movies_list")
@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class MoviesCreation {

    @Id
    private String movieId;
    private String movieName;
    private String movieDesc;
    private String movieGenre;
    private int movieYear;

    // getters, setters and constructor handled by lombok.

}
