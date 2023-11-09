package com.oop.lab8.comparator;

import java.util.Comparator;

public class RatingComparator implements Comparator<Movie> {
    @Override
    public int compare(Movie firstMovie, Movie secondMovie) {
        return Double.compare(firstMovie.getRating(), secondMovie.getRating());
    }
}
