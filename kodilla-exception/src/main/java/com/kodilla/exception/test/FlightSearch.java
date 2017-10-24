package com.kodilla.exception.test;

import java.util.HashMap;

public class FlightSearch {

    public void searchFlight (Flight flight)throws RouteNotFoundException
    {
        HashMap<String, Boolean> destinations = new HashMap<>();
        destinations.put("Warsaw", true);
        destinations.put("London", true);
        destinations.put("Minsk", false);
        destinations.put("Prague", true);
        destinations.put("Damascus", false);

        if(!destinations.containsKey(flight.getArrivalAirport()) || !destinations.containsKey(flight.getDepartureAirport())) {
            throw new RouteNotFoundException("Destination  or arrival airport not found.");
        } else if (destinations.containsValue(false))
            System.out.println("Route not available");
        else {
            System.out.println("Route available");
        }

    }
}
