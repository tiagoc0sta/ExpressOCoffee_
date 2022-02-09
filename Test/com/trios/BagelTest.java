package com.trios;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * BagelTest class - testing the methods in Bagel class
 */
class BagelTest {
    public Bagel b1;

    @BeforeEach
    /**
     * setUp method to be executed before each test method
     */
    void setUp() {
        b1 = new Bagel("Cheese Bagel", true,true,true);
    }

    @Test
    /**
     * testHowManyBagels method is testing howManyBagels method from Bagel's class
     */
    void testHowManyBagels() {
        //method #1
        //int coffees = c1.howManyCoffees(3.00);
        //assertSame(2, coffees);

        //method #2
        assertSame(2, b1.howManyBagels(5.00));
    }
}