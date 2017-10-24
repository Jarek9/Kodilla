package com.kodilla.exception.main;

import com.kodilla.exception.test.SecondChallenge;

public class ExceptionModuleRunner {

    public static void main(String args[]) {

        SecondChallenge secondChallenge = new SecondChallenge();

        try {
            secondChallenge.probablyIWillThrowException(1,1);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
