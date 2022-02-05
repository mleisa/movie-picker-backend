package com.moviepicker.backend;

import com.moviepicker.backend.entity.Genre;
import com.moviepicker.backend.entity.Movie;
import com.moviepicker.backend.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class MoviePickerBackendApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(MoviePickerBackendApplication.class, args);
    }

    @Autowired
    private MovieRepository movieRepository;

    @Override
    public void run(String... args) throws Exception {
        Movie movie1 = Movie.builder()
                .id(1)
                .title("The Hunger Games")
                .genre(Genre.Action)
                .summary("Katniss is having a bad time but survives.")
                .rating(4.2)
                .build();

        Movie movie2 = Movie.builder()
                .id(2)
                .title("The Hunger Games 2: Catching Fire")
                .genre(Genre.Action)
                .summary("Peeta has it worse than Katniss now but will they live?")
                .rating(5.0)
                .build();

        Movie movie3 = Movie.builder()
                .id(3)
                .title("The Hunger Games 3: Mockingjay")
                .genre(Genre.Action)
                .summary("I haven't seen the movie yet but it will be sad probably.")
                .rating(4.5)
                .build();

        Movie movie4 = Movie.builder()
                .id(4)
                .title("High School Musical")
                .genre(Genre.Musical)
                .summary("Troy can play but can he sing, too?")
                .rating(4.0)
                .build();

        Movie movie5 = Movie.builder()
                .id(5)
                .title("High School Musical 2")
                .genre(Genre.Musical)
                .summary("Troy can sing but it's summer, so? Lots of things can happen.")
                .rating(4.5)
                .build();

        Movie movie6 = Movie.builder()
                .id(6)
                .title("High School Musical 3: Homecoming")
                .genre(Genre.Musical)
                .summary("I'm not sure anymore what happens but there is drama again definitely. Sharpay makes it big, too.")
                .rating(3.5)
                .build();

        Movie movie7 = Movie.builder()
                .id(7)
                .title("Hamilton")
                .genre(Genre.Musical)
                .summary("The captivating biography of founding father Alexander Hamilton. Written by Lin-Manuel Miranda.")
                .rating(5.0)
                .build();

        Movie movie8 = Movie.builder()
                .id(8)
                .title("Don't Look Up")
                .genre(Genre.Satire)
                .summary("The story of humanity, told yet another time.")
                .rating(4.0)
                .build();

        Movie movie9 = Movie.builder()
                .id(9)
                .title("Barbie in the Nutcracker")
                .genre(Genre.Romance)
                .summary("Having been shrunk by the mean Mouse King, Barbie and the Nutcracker venture forth to find the Sugar Plum Princess to save the kingdom from the Mouse King. Music by Pyotr Ilyich Tchaikovsky")
                .rating(4.5)
                .build();

        Movie movie10 = Movie.builder()
                .id(10)
                .title("Barbie in Fairytopia")
                .genre(Genre.Adventure)
                .summary("Elina, a wingless fairy, is Fairytopia's last and only hope when the evil fairy Laverna threatens to take control over the enchanted land.")
                .rating(4.5)
                .build();

        Movie movie11 = Movie.builder()
                .id(11)
                .title("Miss Granny")
                .genre(Genre.Comedy)
                .summary("An elderly woman (Na Moon-hee) regains her youthful appearance, changes her name and embarks on a quest for happiness.")
                .rating(4.0)
                .build();

        Movie movie12 = Movie.builder()
                .id(12)
                .title("Secretly Greatly")
                .genre(Genre.Drama)
                .summary("Three elite North Korean sleeper agents live under cover for so long that they believe their cover stories are their real identities. They are shocked when they are ordered to kill one another or face death at the hands of an elite hit team.")
                .rating(4.5)
                .build();

        movieRepository.save(movie1);
        movieRepository.save(movie2);
        movieRepository.save(movie3);
        movieRepository.save(movie4);
        movieRepository.save(movie5);
        movieRepository.save(movie6);
        movieRepository.save(movie7);
        movieRepository.save(movie8);
        movieRepository.save(movie9);
        movieRepository.save(movie10);
        movieRepository.save(movie11);
        movieRepository.save(movie12);
    }
}
