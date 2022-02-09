package com.trios;

/**
 * class product - contains product information. This is a super class
 */
public class Product {
    private String prodName;
    private static double prodPrice;

    /**
     * default constructor
     */
    public Product (){}

    /**
     * method Product
     * @param prodName Product name
     */
    public Product(String prodName) {
        this.prodName = prodName;
        //this.prodPrice = prodPrice;
    }

    /**
     * getters and setters
     */
    public String getProdName() {
        return prodName;
    }

    public void setProdName(String prodName) {
        this.prodName = prodName;
    }

    public static double getProdPrice() {
        return prodPrice;
    }

    public void setProdPrice(double prodPrice) {
        this.prodPrice = prodPrice;
    }
}
