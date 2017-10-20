package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;

public class StreamMain {
    public static void main(String[] args) {


        PoemBeautifier poemBeautifier = new PoemBeautifier();

        poemBeautifier.beautify("Tekst po upiększeniu", string ->"ABC "+ string +" ABC" );
        poemBeautifier.beautify("Tekst po upiększeniu", string -> string.toUpperCase() );
        poemBeautifier.beautify("Tekst po upiększeniu", string -> string.substring(6));
        poemBeautifier.beautify("Tekst po upiększeniu", string -> string.replace("Tekst", "TEKST"));

    }
}

