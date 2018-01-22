package com.kodilla.patterns2.decorator.pizza;

import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

public class PizzaOrderTestSuite {

    @Test
    public void testBasicTaxiOrderGetCost() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new CheeseDecorator(theOrder);
        theOrder = new HamDecorator(theOrder);
        theOrder = new MushroomsDecorator(theOrder);
        System.out.println("Cena Twojej pizzy to: " + theOrder.getCost());
        //When
        BigDecimal theCost= theOrder.getCost();
        //Then
        assertEquals(new BigDecimal(21), theCost);
    }

    @Test
    public void testBasicTaxiOrderGetDescription() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new CheeseDecorator(theOrder);
        theOrder = new HamDecorator(theOrder);
        theOrder = new MushroomsDecorator(theOrder);
        System.out.println(theOrder.getDescription());
        //When
        String description = theOrder.getDescription();
        //Then
        assertEquals("Twoja pizza (ciasto + sos) " +
                "została powiększona o dodatkowe składniki: ser, szynka, pieczarki,",
                description);
    }
}
