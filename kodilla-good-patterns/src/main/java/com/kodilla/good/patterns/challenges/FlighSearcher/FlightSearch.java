package com.kodilla.good.patterns.challenges.FlighSearcher;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FlightSearch {

    private FlightsBase flightsBase = new FlightsBase();
    public List searchDepartureCity(String departureCity)
    {
        List departures = flightsBase.getFlights().stream()
                .filter(departure -> departure.getDepartureCity().equals(departureCity))
                .collect(Collectors.toList());
        return departures;
    }

    public List searchArrivalCity(String arrivalCity)
    {
        List arrivals = flightsBase.getFlights().stream()
                .filter(flight -> flight.getArrivalCity().equals(arrivalCity))
                .collect(Collectors.toList());
        return arrivals;
    }

    public List searchConnectingFlight(String departureCity, String transitCity, String arrivalCity)
    {
        List transit1 = flightsBase.getFlights().stream()
                .filter(flight -> flight.getDepartureCity().equals(departureCity))
                .filter(flight -> flight.getArrivalCity().equals(transitCity))
                .collect(Collectors.toList());
        List transit2 = flightsBase.getFlights().stream()
                .filter(flight -> flight.getDepartureCity().equals(transitCity))
                .filter(flight -> flight.getArrivalCity().equals(arrivalCity))
                .collect(Collectors.toList());

        List transits = new ArrayList<>(transit1);
        transits.addAll(transit2);

        return transits;
    }
}
