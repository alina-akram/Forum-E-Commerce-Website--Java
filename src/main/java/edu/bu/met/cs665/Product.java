/**
 * Alina Akram
 * Course CS-665
 * Summer 2
 * Term Project
 * August 18, 2020
 */
package edu.bu.met.cs665;

public abstract class Product {


    protected String name;
    protected double price;
    protected String category;

    public Product(String name, double price, String category){
        //constructor
        this.name = name;
        this.price = price;
        this.category = category;
    }


    public abstract void displayProductDetails();
    //to display product details in individual product classes

    public double getPrice() {
        //method to get product price
        return price;
    }
    public String getName(){
        //method to get product name
        return name;
    }
}
