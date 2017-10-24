package com.kodilla.exception.test;

public class RouteNotFoundRunner {

    public static void main (String[] args) {

        FlightSearch flightSearch = new FlightSearch();
        Flight flight = new Flight("Madrit", "Paris");

        try {
            flightSearch.searchFlight(flight);
        } catch (RouteNotFoundException e) {
            System.out.println("Error: \n" + e + "\n ");
        }finally {
            System.out.println("Wanna check new route?");
        }
    }

}

