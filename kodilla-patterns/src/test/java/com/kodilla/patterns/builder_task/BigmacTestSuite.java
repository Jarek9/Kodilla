package com.kodilla.patterns.builder_task;

import org.junit.Assert;
import org.junit.Test;

public class BigmacTestSuite {

    @Test
    public void testBigmacNew() {
        //Given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .roll("Sesame roll")
                .burgers(4)
                .sauce("1000Islands")
                .ingredient("Salat")
                .ingredient("Onion")
                .ingredient("Cucumber")
                .ingredient("Cheese")
                .ingredient("Shrimps")
                .build();
        System.out.println(bigmac);
        //When
        int howManyIngredients = bigmac.getIngredients().size();
        int howManyBurgers = bigmac.getBurgers();
        String rollType = bigmac.getRoll();
        String sauceType = bigmac.getSauce();
        //Then
        Assert.assertEquals(5, howManyIngredients);
        Assert.assertEquals(4, howManyBurgers);
        Assert.assertEquals("Sesame roll", rollType);
        Assert.assertEquals("1000Islands", sauceType);

    }
}
