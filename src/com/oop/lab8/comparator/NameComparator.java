package com.oop.lab8.comparator;

import java.util.Comparator;

public class NameComparator implements Comparator<Movie> {
    @Override
    public int compare(Movie firstMovie, Movie secondMovie) {
        return firstMovie.getName().compareTo(secondMovie.getName());
    }
}
