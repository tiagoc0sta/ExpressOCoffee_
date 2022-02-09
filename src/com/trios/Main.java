package com.trios;

/**
 * main class of program
 */
public class Main {

    /**
     * main method - instantiate 3 products and one costumer to test methods
     * @param args
     */
    public static void main(String[] args) {
        Coffee c1 = new Coffee("Black Coffee", 1,2);
        Bagel b1 = new Bagel("Cheese Bagel", true,true,true);
        Donut d1 = new Donut("Glazed Donut");

        Customer k1 = new Customer("Soma");
        k1.addToCart(c1);
        k1.addToCart(b1);
        k1.addToCart(d1);
        k1.addToCart(d1);
        k1.addToCart(b1);
        k1.displayCart();
    }
}
