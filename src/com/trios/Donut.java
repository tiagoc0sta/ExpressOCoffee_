package com.trios;

/**
 * class donuts inherits from class Products
 */
public class Donut extends Product {
    //static final double price = 1.50;

    /**
     * howManyDonuts method calculates how many donuts is possible to buy with a certain amount of money
     * @param amount available to spend buying a donut
     * @return quantity of donuts possible to buy with the provided amount
     */
    public static int howManyDonuts(double amount){
        double qty = amount/getProdPrice();
        return (int)qty;
    }

    /**
     * default constructor
     */
    public Donut(){}

    /**
     * constructor
     * @param prodName product name
     * set default donut price to 2.00
     */
    public Donut(String prodName) {
        super(prodName);
        setProdPrice(2.00); //donut price
    }
}
