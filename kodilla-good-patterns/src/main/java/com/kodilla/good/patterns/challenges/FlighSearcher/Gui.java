package com.kodilla.good.patterns.challenges.FlighSearcher;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Gui extends JFrame implements ActionListener {

    JLabel lDepartureChooser, lDestinationChooser, JResult;
    JMenuBar menuBar;
    JButton bSearch, bReset;
    JMenu menuFile, menuHelp;
    JMenuItem menuClose, menuAbout;
    JComboBox bDepartureCity, bArrivalCity;
    private String arrivalCity;
    private String departureCity;


    public Gui() {
        setLayout(null);
        menuBar = new JMenuBar();
        menuFile = new JMenu("File");
        menuClose = new JMenuItem("Close");

        menuClose.addActionListener(this);
        menuClose.setAccelerator(KeyStroke.getKeyStroke("ctrl X"));

        menuFile.add(menuClose);

        menuHelp = new JMenu("Help");
        menuAbout = new JMenuItem("About");
        menuAbout.addActionListener(this);
        menuHelp.add(menuAbout);

        setJMenuBar(menuBar);
        menuBar.add(menuFile);
        menuBar.add(menuHelp);

        menuFile.setFont(new Font("SansSerif", Font.BOLD, 20));
        menuHelp.setFont(new Font("SansSerif", Font.BOLD, 20));
        menuClose.setFont(new Font("SansSerif", Font.BOLD, 20));
        menuAbout.setFont(new Font("SansSerif", Font.BOLD, 20));

        JResult = new JLabel();
        JResult.setBounds(100, 50, 600, 400);
        JResult.setFont(new Font("SansSerif", Font.BOLD, 20));
        JResult.setForeground(Color.BLUE);
        JResult.setText("Searching results: ");
        add(JResult);

        bDepartureCity = new JComboBox();
        bDepartureCity.setBounds(100, 100, 150, 40);
        bDepartureCity.setFont(new Font("SansSerif", Font.BOLD, 20));
        bDepartureCity.addItem(" ");
        bDepartureCity.addItem("Gdansk");
        bDepartureCity.addItem("Krakow");
        bDepartureCity.addItem("Warsaw");
        bDepartureCity.addItem("Wroclaw");
        bDepartureCity.addItem("Lodz");
        bDepartureCity.addItem("Szczecin");
        add(bDepartureCity);
        bDepartureCity.addActionListener(this);

        bArrivalCity = new JComboBox<String>();
        bArrivalCity.setBounds(320, 100, 150, 40);
        bArrivalCity.setFont(new Font("SansSerif", Font.BOLD, 20));
        bArrivalCity.addItem(" ");
        bArrivalCity.addItem("Gdansk");
        bArrivalCity.addItem("Krakow");
        bArrivalCity.addItem("Warsaw");
        bArrivalCity.addItem("Wroclaw");
        bArrivalCity.addItem("Lodz");
        bArrivalCity.addItem("Szczecin");
        add(bArrivalCity);
        bArrivalCity.addActionListener(this);

        bSearch = new JButton("SEARCH !");
        bSearch.setBounds(550, 100, 150, 40);
        add(bSearch);
        bSearch.addActionListener(this);
        bSearch.setFont(new Font("SansSerif", Font.BOLD, 20));

        bReset = new JButton("RESET!");
        bReset.setBounds(320, 650, 150, 40);
        add(bReset);
        bReset.addActionListener(this);
        bReset.setFont(new Font("SansSerif", Font.BOLD, 20));

        lDepartureChooser = new JLabel("Choose starting point", JLabel.RIGHT);
        lDepartureChooser.setBounds(90, 80, 160, 20);
        lDepartureChooser.setFont(new Font("SansSerif", Font.BOLD, 15));
        add(lDepartureChooser);

        lDestinationChooser = new JLabel("Choose destination point", JLabel.RIGHT);
        lDestinationChooser.setBounds(300, 80, 180, 20);
        lDestinationChooser.setFont(new Font("SansSerif", Font.BOLD, 15));
        add(lDestinationChooser);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        FlightSearch flightSearch = new FlightSearch();

        if (e.getSource() == menuClose) {
            int odp = JOptionPane.showConfirmDialog(null, "ARE YOU SURE?", "QUESTION",
                    JOptionPane.YES_NO_OPTION);
            if (odp == JOptionPane.YES_OPTION)
                dispose();
            else if (odp == JOptionPane.NO_OPTION) {
                JOptionPane.showMessageDialog(null, "OK");
            } else if (odp == JOptionPane.CLOSED_OPTION) {
                JOptionPane.showMessageDialog(null, "YOU HAVE TO CHOOSE YES OR NO", "TITLE", JOptionPane.WARNING_MESSAGE);
            }

        }
        if (e.getSource() == bDepartureCity) {
            String departureCity = bDepartureCity.getSelectedItem().toString();
        }
        if (e.getSource() == bArrivalCity) {
            String arrivalCity = bArrivalCity.getSelectedItem().toString();
        }
        if (e.getSource() == bSearch)
        {

            flightSearch.searchDepartureCity(bDepartureCity.getSelectedItem().toString());
            flightSearch.searchArrivalCity(bArrivalCity.getSelectedItem().toString());
        }
    }

    public String getArrivalCity() {
        return arrivalCity;
    }

    public String getDepartureCity() {
        return departureCity;
    }

}
