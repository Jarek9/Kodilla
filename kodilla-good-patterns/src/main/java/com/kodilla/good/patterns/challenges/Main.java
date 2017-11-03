package com.kodilla.good.patterns.challenges;

import java.util.stream.Collectors;

public class Main {
    //This class refers MovieStore task 9.1, pls do not use.
    public static void main(String[] args) {

        MovieStore movieStore = new MovieStore();

        String listOfMovies = movieStore.getMovies().entrySet().stream()
                .flatMap(title -> title.getValue().stream())
                .collect(Collectors.joining("!"));
        System.out.println(listOfMovies);
    }
}
