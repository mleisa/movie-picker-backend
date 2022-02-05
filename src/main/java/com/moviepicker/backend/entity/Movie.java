package com.moviepicker.backend.entity;

import lombok.*;

import javax.persistence.*;
import javax.transaction.TransactionScoped;
import java.util.ArrayList;
import java.util.List;

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
    private Genre genre;

    @Column(name = "Summary")
    private String summary;

    private Double rating;
}
