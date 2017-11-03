package com.kodilla.good.patterns.challenges;

public class MailService implements InformationService {

    @Override
    public void inform(User user) {
        System.out.println("Szanowny(a) " + user.getName() + " " + user.getSurname()
        + " Twoje zamówienie zostało wysłane");

    }
}
