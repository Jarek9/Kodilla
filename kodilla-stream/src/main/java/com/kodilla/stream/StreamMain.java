package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;

public class StreamMain {
    public static void main(String[] args) {

//        Processor processor = new Processor();
//        processor.execute(() -> System.out.println("This is an example text."));


//        ExpressionExecutor expressionExecutor = new ExpressionExecutor();
//
//        System.out.println("Calculating expressions with lambdas");
//        expressionExecutor.executeExpression(10, 5, (a, b) -> a + b);
//        expressionExecutor.executeExpression(10, 5, (a, b) -> a - b);
//        expressionExecutor.executeExpression(10, 5, (a, b) -> a * b);
//        expressionExecutor.executeExpression(10, 5, (a, b) -> a / b);
//
//        System.out.println("Calculating expressions with method references");
//        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::multiplyAByB);
//        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::addAToB);
//        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::subBFromA);
//        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::divideAByB);

        PoemBeautifier poemBeautifier = new PoemBeautifier();

        poemBeautifier.beautify("Tekst po upiększeniu", string ->"ABC "+ string +" ABC" );
        poemBeautifier.beautify("Tekst po upiększeniu", string -> string.toUpperCase() );
        poemBeautifier.beautify("Tekst po upiększeniu", string -> string.substring(6));
        poemBeautifier.beautify("Tekst po upiększeniu", string -> string.replace("Tekst", "TEKST"));

    }
}

