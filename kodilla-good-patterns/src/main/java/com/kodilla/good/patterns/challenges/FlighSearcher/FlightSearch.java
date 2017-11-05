package com.kodilla.good.patterns.challenges.FlighSearcher;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FlightSearch {

    Gui gui = new Gui();
    private FlightsBase flightsBase = new FlightsBase();
    public List<Flight> searchDepartureCity(String departureCity)
    {
        System.out.println("Searching flights from: " + gui.getDepartureCity());
        List<Flight> departures = flightsBase.getFlights().stream()
                .filter(departure -> departure.getDepartureCity().equals(gui.getDepartureCity()))
                .collect(Collectors.toList());
        return departures;
    }

    public List<Flight> searchArrivalCity(String arrivalCity)
    {
        System.out.println("Searching flights to: " + gui.getArrivalCity());
        List<Flight> arrivals = flightsBase.getFlights().stream()
                .filter(flight -> flight.getArrivalCity().equals(gui.getArrivalCity()))
                .collect(Collectors.toList());
        return arrivals;
    }

    public List<Flight> searchConnectingFlight(String departureCity, String transitCity, String arrivalCity)
    {
        System.out.println("Searching connecting flights from " + gui.getDepartureCity() + " to " + gui.getArrivalCity());
        List<Flight> transit1 = flightsBase.getFlights().stream()
                .filter(flight -> flight.getDepartureCity().equals(gui.getDepartureCity()))
                .filter(flight -> flight.getArrivalCity().equals(transitCity))
                .collect(Collectors.toList());
        List<Flight> transit2 = flightsBase.getFlights().stream()
                .filter(flight -> flight.getDepartureCity().equals(transitCity))
                .filter(flight -> flight.getArrivalCity().equals(gui.getArrivalCity()))
                .collect(Collectors.toList());

        List<Flight> transits = new ArrayList<>(transit1);
        transits.addAll(transit2);

        return transits;
    }
}
