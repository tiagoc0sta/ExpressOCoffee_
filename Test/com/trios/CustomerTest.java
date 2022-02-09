package com.trios;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * customer information class
 */
class CustomerTest {
    public Coffee c1;
    public Bagel b1;
    public Donut d1;
    public Customer k1;

    @BeforeEach
    /**
     * setUp method to be executed before each test method
     */
    void setUp() {
        c1 = new Coffee("Black Coffee", 1,2);
        b1 = new Bagel("Cheese Bagel", true,true,true);
        d1 = new Donut("Glazed Donut");
        //k1 = new Customer("Soma");
    }

    @Test
    /**
     * testAddToCartLOW method checks current balance and return a message
     */
    void testAddToCartLOW() {
        k1 = new Customer("Soma", 2.00);
        assertSame("LOW", k1.addToCart(b1));
    }
    @Test
    /**
     * testAddToCartWARN method is testing addToCart method from Customer's class
     */
    void testAddToCartWARN() {
        k1 = new Customer("Soma", 5.00);
        assertSame("WARNING", k1.addToCart(b1));
    }
    @Test
    /**
     * testAddToCartSUCESS method is testing addToCart method from Customer's class
     */
    void testAddToCartSUCESS() {
        k1 = new Customer("Soma", 10.00);
        assertSame("OK", k1.addToCart(b1));
    }

    @Test
    /**
     * testDisplayCart method is testing displayCart method from Customer's class
     */
    void testDisplayCart() {
        k1 = new Customer("Soma", 10.00);
        assertSame("DISPLAYED", k1.displayCart());
    }
}