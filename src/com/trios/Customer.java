package com.trios;

import java.util.ArrayList;

/**
 * class customer
 */
public class Customer {
    private String customerName;
    private double balance;
    private ArrayList<Product> cart;

    /**
     * method addToCart insert bought items into cart
     * @param newProduct new product to be inserted into cart
     * @return WARNING, OK or LOW depending on how much balance the user has before and after the transaction
     */
    public String addToCart(Product newProduct){
        if(getBalance() > newProduct.getProdPrice()){
            this.cart.add(newProduct);
            balance -= newProduct.getProdPrice();
            if(getBalance() < 5.00){
                System.out.println("\nWARNING!!! Low Balance! Your current balance is: $" + getBalance() +"\n");
                return "WARNING";
            } else {
                System.out.println("\nSuccess! Your current balance is: $" + getBalance() +"\n");
                return "OK";
            }
        } else {
            System.out.println("Low Balance! Your current balance is: $" + getBalance() +"\n");
            return "LOW";
        }

    }

    /**
     * displayCart method displays the total cart items and the items names
     * @return displayed as a confirmation function ran ok
     */
    public String displayCart(){
        System.out.println("Your cart items: ");
        cart.forEach((n) -> System.out.println(n.getProdName()));
        System.out.println("Total items in your cart: " + cart.size());
        return "DISPLAYED";
    }

    /**
     * default constructor
     */
    public Customer(){}

    /**
     * constructor
     * @param customerName curstomer name
     */
    public Customer(String customerName) {
        this.customerName = customerName;
        this.balance = 10; //initial balance (giftcard of $10)
        this.cart = new ArrayList<Product>();
    }

    //only for testing purposes

    /**
     * constructor including balance parameter in order to be tested
     * @param customerName customer name
     * @param balance current balance
     */
    public Customer(String customerName, double balance) {
        this.customerName = customerName;
        this.balance = balance;
        this.cart = new ArrayList<Product>();
    }

    /**
     * getters and setters
     */
    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public ArrayList<Product> getProductsBought() {
        return cart;
    }

    public void setProductsBought(ArrayList<Product> productsBought) {
        this.cart = productsBought;
    }
}
