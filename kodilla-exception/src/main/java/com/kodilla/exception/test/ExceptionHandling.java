package com.kodilla.exception.test;

public class ExceptionHandling extends Exception{

    public static void main(String args[]) {

        SecondChallenge secondChallenge = new SecondChallenge();

        try {
            secondChallenge.probablyIWillThrowException(1,1);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
