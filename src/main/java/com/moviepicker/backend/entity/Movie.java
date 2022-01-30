package com.moviepicker.backend.entity;

import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "movies")
public class Movie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "Title")
    private String title;

    @Column(name = "Genre")
    private Genre genreList;

    private Double rating;
}
