package com.kodilla.exception.challenge;

import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;

public class FirstChallenge {

    public double divide(double a, double b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException();
        }
        return a / b;
    }

    /**
     * This main can throw an ArithmeticException!!!
     *
     * @param args
     */
    public static void main(String[] args) {

        FirstChallenge firstChallenge = new FirstChallenge();

        try {

            double result = firstChallenge.divide(3, 0);

            System.out.println(result);
        } catch (ArithmeticException e)
        {
            System.out.println(e);

        }finally
        {
            System.out.println("Divide by 0 error");
        }


    }
}


