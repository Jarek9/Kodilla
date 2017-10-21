package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class WorldTestSuite {
     @Test
    public void testGetPeopleQuantity() {


        //Given
        World world = new World();

        Country Poland = new Country("Polska", new BigDecimal("38000000"));
        Country Germany = new Country("Deutschland", new BigDecimal("82000000"));
        Country Spain = new Country("Espania", new BigDecimal("39000000"));
        Country Brasil = new Country("Brasil", new BigDecimal("130000000"));
        Country China = new Country("China", new BigDecimal("1300000000"));

        Continent Europe = new Continent("Europe");
        Continent southAmerica = new Continent("South America");
        Continent Asia = new Continent("Asia");


        //When
        world.addContinent(Europe);
        world.addContinent(southAmerica);
        world.addContinent(Asia);

        Europe.addCountry(Poland);
        Europe.addCountry(Germany);
        Europe.addCountry(Spain);
        southAmerica.addCountry(Brasil);
        Asia.addCountry(China);

        //Then
        Assert.assertEquals(new BigDecimal("1589000000"), world.getPeopleQuantity());
    }
}
