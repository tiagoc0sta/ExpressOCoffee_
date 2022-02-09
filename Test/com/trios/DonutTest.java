package com.trios;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * DonutTest class - testing the methods in Donut class
 */
class DonutTest {
    public Donut d1;

    @BeforeEach
    /**
     * setUp method to be executed before each test method
     */
    void setUp() {
        d1 = new Donut("Glazed Donut");
    }

    @Test
    /**
     * testHowManyDonuts method is testing howManyDonuts method from Coffee's class
     */
    void testHowManyDonuts() {
        //method #1
        //int coffees = c1.howManyCoffees(3.00);
        //assertSame(2, coffees);

        //method #2
        assertSame(2, d1.howManyDonuts(4.00));
    }
}