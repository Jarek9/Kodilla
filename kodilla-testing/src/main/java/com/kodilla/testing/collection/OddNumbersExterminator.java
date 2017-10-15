package com.kodilla.testing.collection;

import java.util.ArrayList;

import java.util.Random;

public class OddNumbersExterminator {



    public ArrayList<Integer> exterminate(ArrayList<Integer> numbers) {



        ArrayList<Integer> evenNumbers = new ArrayList<>();



        for (int evenNumber : numbers) {

            if (evenNumber %2 == 0){

                evenNumbers.add(evenNumber);

            }

        }

        return evenNumbers;

    }

}