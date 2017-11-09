package com.kodilla.good.patterns.challenges.FlighSearcher;

import java.util.ArrayList;
import java.util.List;

public class FlightsBase {

    private List<Flight> flights;

    public FlightsBase()
    {
        this.flights = new ArrayList<>();
        flights.add(new Flight("Gdansk", "Krakow"));
        flights.add(new Flight("Gdansk",  "Warsaw"));
        flights.add(new Flight("Gdansk",  "Wroclaw"));
        flights.add(new Flight("Gdansk",  "Lodz"));
        flights.add(new Flight("Gdansk",  "Szczecin"));

        flights.add(new Flight("Krakow",  "Gdansk"));
        flights.add(new Flight("Krakow",  "Warsaw"));
        flights.add(new Flight("Krakow",  "Wroclaw"));
        flights.add(new Flight("Krakow",  "Lodz"));
        flights.add(new Flight("Krakow",  "Szczecin"));

        flights.add(new Flight("Warsaw",  "Gdansk"));
        flights.add(new Flight("Warsaw",  "Krakow"));
        flights.add(new Flight("Warsaw",  "Wroclaw"));
        flights.add(new Flight("Warsaw",  "Lodz"));
        flights.add(new Flight("Warsaw",  "Szczecin"));

        flights.add(new Flight("Wroclaw",  "Gdansk"));
        flights.add(new Flight("Wroclaw",  "Krakow"));
        flights.add(new Flight("Wroclaw",  "Warsaw"));
        flights.add(new Flight("Wroclaw",  "Lodz"));
        flights.add(new Flight("Wroclaw",  "Szczecin"));

        flights.add(new Flight("Lodz",  "Gdansk"));
        flights.add(new Flight("Lodz",  "Krakow"));
        flights.add(new Flight("Lodz",  "Warsaw"));
        flights.add(new Flight("Lodz",  "Wroclaw"));
        flights.add(new Flight("Lodz",  "Szczecin"));

        flights.add(new Flight("Szczecin",  "Gdansk"));
        flights.add(new Flight("Szczecin",  "Krakow"));
        flights.add(new Flight("Szczecin",  "Warsaw"));
        flights.add(new Flight("Szczecin",  "Wroclaw"));
        flights.add(new Flight("Szczecin",  "Lodz"));
    }

    public List<Flight> getFlights() {return flights;}
}
