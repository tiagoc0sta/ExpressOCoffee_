package com.trios;

/**
 * class Coffee inherits from class Products
 */
public class Coffee extends Product {
    private int numOfCream;
    private int numOfSugar;
    //static final double price = 1.50;

    /**
     *
     * howManyCoffees method calculates how many coffees is possible to buy with a certain amount of money
     * @param amount available to spend buying a bagel
     * @return quantity of coffees possible to buy with the provided amount
     */
    public static int howManyCoffees(double amount){
        double qty = amount/getProdPrice();
        return (int)qty;
    }

    /**
     * default constructor
     */
    public Coffee(){}

    /**
     * constructor
     * @param prodName product name
     * @param numOfCream number of cream
     * @param numOfSugar number of sugar
     * set default coffee price to 1.50
     */
    public Coffee(String prodName, int numOfCream, int numOfSugar) {
        super(prodName);
        this.numOfCream = numOfCream;
        this.numOfSugar = numOfSugar;
        setProdPrice(1.50); //coffee price
    }

    /**
     * getters and setters
     */
    public int getNumOfCream() {
        return numOfCream;
    }

    public void setNumOfCream(int numOfCream) {
        this.numOfCream = numOfCream;
    }

    public int getNumOfSugar() {
        return numOfSugar;
    }

    public void setNumOfSugar(int numOfSugar) {
        this.numOfSugar = numOfSugar;
    }


}
