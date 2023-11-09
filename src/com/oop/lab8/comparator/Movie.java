package com.oop.lab8.comparator;

public class Movie implements Comparable<Movie> {
    private String name;
    private double rating;
    private int year;

    public Movie(String name, double rating, int year) {
        this.name = name;
        this.rating = rating;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public int compareTo(Movie another) {
        if (this.year < another.year) {
            return -1;
        }
        if (this.year > another.year) {
            return 1;
        }
        if (this.name.compareTo(another.name) < 0) {
            return -1;
        } else if (this.name.compareTo(another.name) > 0) {
            return 1;
        }
        return 0;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "name='" + name + '\'' +
                ", rating=" + rating +
                ", year=" + year +
                '}';
    }
}
