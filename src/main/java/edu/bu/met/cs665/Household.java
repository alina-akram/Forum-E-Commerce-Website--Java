/**
 * Alina Akram
 * Course CS-665
 * Summer 2
 * Term Project
 * August 18, 2020
 */
package edu.bu.met.cs665;

public class Household extends Product{
    private String decorType;
    private boolean isPowered;

    public Household(String name, double price, String category, String decorType, boolean isPowered){
        //constructor
        super(name, price, category);
        this.decorType = decorType;
        this.isPowered = isPowered;

    }

    @Override
    public void displayProductDetails() {
        //display product details
        System.out.println(name + " Has been selected " + " Product Details: "+ " Product: " + name + " Price:  " + price
                + " Category:  " + category + " Decor Type: "
               + decorType + " Powered:  " + isPowered);



    }
}
