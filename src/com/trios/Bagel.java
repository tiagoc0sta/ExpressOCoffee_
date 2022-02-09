package com.trios;

/**
 * class Bagel inherits from class Products
 */
public class Bagel extends Product {
    private boolean toasted;
    private boolean creamCheese;
    private boolean butter;
    //static final double price = 1.50;


    /**
     * howManyBagels method calculates how many bagels is possible to buy with a certain amount of money
     * @param amount available to spend buying a bagel
     * @return quantity of bagels possible to buy with the provided amount
     */
    public static int howManyBagels(double amount){
        double qty = amount/getProdPrice();
        return (int)qty;
    }

    /**
     * default constructor
     */
    public Bagel(){}

    /**
     * constructor
     * @param prodName Product name
     * @param toasted Toasted or not
     * @param creamCheese With cream cheese or not
     * @param butter with butter or not
     * set default bagel price to 2.50
     */
    public Bagel(String prodName, boolean toasted, boolean creamCheese, boolean butter) {
        super(prodName);
        this.toasted = toasted;
        this.creamCheese = creamCheese;
        this.butter = butter;
        setProdPrice(2.50); //bagel price
    }

    /**
     * getters and setters
     */
    public boolean isToasted() {
        return toasted;
    }

    public void setToasted(boolean toasted) {
        this.toasted = toasted;
    }

    public boolean isCreamCheese() {
        return creamCheese;
    }

    public void setCreamCheese(boolean creamCheese) {
        this.creamCheese = creamCheese;
    }

    public boolean isButter() {
        return butter;
    }

    public void setButter(boolean butter) {
        this.butter = butter;
    }


}


