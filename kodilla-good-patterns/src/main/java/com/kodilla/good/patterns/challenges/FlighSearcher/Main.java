package com.kodilla.good.patterns.challenges.FlighSearcher;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        Gui gui = new Gui();
        gui.setVisible(true);
        gui.setLocationRelativeTo(null);
        gui.setSize(800, 800);
        gui.setResizable(false);
        gui.setTitle("FLIGHT SEARCHER");
        gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        FlightSearch flightSearch = new FlightSearch();

        System.out.println(flightSearch.searchDepartureCity("Szczecin"));
        System.out.println(flightSearch.searchArrivalCity("Wroclaw"));
        System.out.println(flightSearch.searchConnectingFlight("Warsaw", "Lodz", "Krakow"));
    }
}
