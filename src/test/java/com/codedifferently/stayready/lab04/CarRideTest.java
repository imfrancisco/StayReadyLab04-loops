package com.codedifferently.stayready.lab04;


import org.junit.Assert;
import org.junit.Test;

public class CarRideTest {
    @Test
    public void areWeThereYetTest(){
        // Given
        CarRide aCarRide = new CarRide();
        boolean expected = true;

        // When
        boolean actual = aCarRide.areWeThereYet();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void areWeThereYetNoTest(){
        // Given
        CarRide aCarRide = new CarRide();
        boolean expected = false;

        // When
        boolean actual = aCarRide.areWeThereYet();

        // Then
        Assert.assertEquals(expected, actual);
    }
}
