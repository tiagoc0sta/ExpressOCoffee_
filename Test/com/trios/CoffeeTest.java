package com.trios;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * CoffeeTest class - testing the methods in Coffee class
 */
class CoffeeTest {
    public Coffee c1;

    @BeforeEach
    /**
     * setUp method to be executed before each test method
     */
    void setUp() {
        c1 = new Coffee("Black Coffee", 1,2);
    }

    @Test
    /**
     * testHowManyCoffees method is testing howManyCoffees method from Coffee's class
     */
    void testHowManyCoffees() {
        //method #1
        //int coffees = c1.howManyCoffees(3.00);
        //assertSame(2, coffees);

        //method #2
        assertSame(2, c1.howManyCoffees(3.00));
    }
}