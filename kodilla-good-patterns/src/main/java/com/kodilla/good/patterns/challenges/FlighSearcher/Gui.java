package com.kodilla.good.patterns.challenges.FlighSearcher;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class Gui extends JFrame implements ActionListener {

    JLabel lDepartureChooser, lDestinationChooser, lConnectionChooser, JResult;
    JMenuBar menuBar;
    JButton bSearch, bReset;
    JMenu menuFile, menuHelp;
    JMenuItem menuClose, menuAbout;
    JComboBox bDepartureCity, bArrivalCity, bConnecting;
    JTextArea textField;



    public Gui() {
        setLayout(null);
        try {
            UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (UnsupportedLookAndFeelException e) {
            e.printStackTrace();
        }
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

        textField = new JTextArea();
        textField.setWrapStyleWord(true);
        JScrollPane scrollPane = new JScrollPane(textField);
        scrollPane.setBounds(20, 135, 760, 270);
        textField.setFont(new Font("SansSerif", Font.BOLD, 16));
        textField.setForeground(Color.BLUE);
        add(scrollPane);

        JResult = new JLabel("Searching results: ", JLabel.LEFT);
        JResult.setFont(new Font("SansSerif", Font.BOLD, 20));
        JResult.setBounds(20, 90, 250, 25);
        add(JResult);

        bDepartureCity = new JComboBox();
        bDepartureCity.setBounds(20, 40, 110, 40);
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

        bConnecting = new JComboBox();
        bConnecting.setBounds(250, 40, 110, 40);
        bConnecting.setFont(new Font("SansSerif", Font.BOLD, 20));
        bConnecting.addItem(" ");
        bConnecting.addItem("Gdansk");
        bConnecting.addItem("Krakow");
        bConnecting.addItem("Warsaw");
        bConnecting.addItem("Wroclaw");
        bConnecting.addItem("Lodz");
        bConnecting.addItem("Szczecin");
        add(bConnecting);
        bConnecting.addActionListener(this);

        bArrivalCity = new JComboBox();
        bArrivalCity.setBounds(450, 40, 110, 40);
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
        bSearch.setBounds(620, 40, 130, 40);
        add(bSearch);
        bSearch.addActionListener(this);
        bSearch.setFont(new Font("SansSerif", Font.BOLD, 20));

        bReset = new JButton("RESET");
        bReset.setBounds(320, 410, 130, 40);
        add(bReset);
        bReset.addActionListener(this);
        bReset.setFont(new Font("SansSerif", Font.BOLD, 20));

        lDepartureChooser = new JLabel("Choose starting point", JLabel.LEFT);
        lDepartureChooser.setBounds(15, 20, 160, 20);
        lDepartureChooser.setFont(new Font("SansSerif", Font.BOLD, 15));
        add(lDepartureChooser);

        lConnectionChooser = new JLabel("Choose connection", JLabel.LEFT);
        lConnectionChooser.setBounds(250, 20, 160, 20);
        lConnectionChooser.setFont(new Font("SansSerif", Font.BOLD, 15));
        add(lConnectionChooser);

        lDestinationChooser = new JLabel("Choose destination", JLabel.LEFT);
        lDestinationChooser.setBounds(450, 20, 180, 20);
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

        if (e.getSource() == menuAbout)
        {
            JOptionPane.showMessageDialog(null, "Simple Flight Searcher \n Version Alfa 0.1", "Tytuł",
                    JOptionPane.WARNING_MESSAGE);
        }

        if (e.getSource() == bSearch)
        {

            List d = flightSearch.searchDepartureCity(bDepartureCity.getSelectedItem().toString());
            List a = flightSearch.searchArrivalCity(bArrivalCity.getSelectedItem().toString());
            List t = flightSearch.searchConnectingFlight(bDepartureCity.getSelectedItem().toString(),
                    bConnecting.getSelectedItem().toString(), bArrivalCity.getSelectedItem().toString());
            String departure = bDepartureCity.getSelectedItem().toString();
            String arrival = bArrivalCity.getSelectedItem().toString();
            textField.setText("");
            textField.setText("Searching flights from: " + departure + "\n "
            + "\n " + d.toString() + "\n " + "\nSearching flights to: " + arrival + "\n "
                    + "\n " + a.toString() + "\n " + "\n " + "Searching connecting flights from: "
                    + departure + " to: " + arrival + "\n "+ "\n " + t.toString());

        }

        if (e.getSource() == bReset)
        {

            textField.setText(" ");

        }


    }



}
