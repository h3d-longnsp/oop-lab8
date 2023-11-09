package com.oop.lab8.comparable;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ComparableTest {
    public static void main(String[] args) {
//        int[] intArray = new int[]{1, 10, 23, 313, 5, 7, 27, 14, 6};
//        System.out.println(Arrays.toString(intArray));
//
//        sort(intArray);
//        System.out.println(Arrays.toString(intArray));

        List<Movie> movies = new LinkedList<>();
        movies.add(new Movie("GOTG2", 7.5, 2023));
        movies.add(new Movie("MI6", 9, 2015));
        movies.add(new Movie("Dead Reckoning", 8.5, 2022));
        movies.add(new Movie("GOTG", 7.5, 2020));
        movies.add(new Movie("AA", 4, 2015));

        printMovies(movies);

        sortMovieByYear(movies);
        System.out.println("After sorting: ");
        printMovies(movies);
    }

    public static void sortMovieByYear(List<Movie> movies) {
        if (movies == null) {
            return;
        }

        int n = movies.size();
        boolean swapped;
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (movies.get(j).compareTo(movies.get(j + 1)) > 0) {
                    // Swap arr[j] and arr[j+1]
                    Movie temp = movies.get(j);
                    movies.set(j, movies.get(j + 1));
                    movies.set(j + 1, temp);
                    swapped = true;
                }
            }

            // If no two elements were
            // swapped by inner loop, then break
            if (!swapped)
                break;
        }
    }

    public static void sort(int[] array) {
        if (array == null) {
            return;
        }

        int n = array.length;
        boolean swapped;
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    // Swap arr[j] and arr[j+1]
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    swapped = true;
                }
            }

            // If no two elements were
            // swapped by inner loop, then break
            if (!swapped)
                break;
        }
    }

    public static void printMovies(List<Movie> movies) {
        for (Movie movie : movies) {
            System.out.println(movie);
        }
    }
}
