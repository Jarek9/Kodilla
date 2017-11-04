package com.kodilla.good.patterns.challenges.E_Store.Service;

import com.kodilla.good.patterns.challenges.E_Store.Users.User;

public class MailService implements InformationService {

    @Override
    public void inform(User user) {
        System.out.println("Szanowny(a) " + user.getName() + " " + user.getSurname()
        + " Twoje zamówienie zostało wysłane");

    }
}
