package com.oop.lab8.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparatorTest {
    public static void main(String[] args) {
        List<Movie> moviesList = new ArrayList<>();
        moviesList.add(new Movie("Empire Strikes Back", 9.3, 1980));
        moviesList.add(new Movie("Force Awakens", 8.3, 2015));
        moviesList.add(new Movie("A New Hope", 7.7, 1977));
        moviesList.add(new Movie("Return of the Jedi", 8.5, 1983));
        printMovies(moviesList);

        System.out.println("Sorted by rating: ");
        RatingComparator ratingComparator = new RatingComparator();
        moviesList.sort(ratingComparator);
        printMovies(moviesList);

        System.out.println("Sorted by name: ");
        NameComparator nameComparator = new NameComparator();
        moviesList.sort(nameComparator);
        printMovies(moviesList);

        System.out.println("Sorted by year: ");
        Collections.sort(moviesList);
        printMovies(moviesList);
    }

    public static void printMovies(List<Movie> movies) {
        for (Movie movie : movies) {
            System.out.println(movie);
        }
    }
}
