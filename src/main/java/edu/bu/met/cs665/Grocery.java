/**
 * Alina Akram
 * Course CS-665
 * Summer 2
 * Term Project
 * August 18, 2020
 */
package edu.bu.met.cs665;

public class Grocery extends Product{
    private boolean isProduce;
    private boolean isFrozen;


    public Grocery(String name, double price, String category,boolean isProduce,boolean isFrozen){
        //constructor
        super(name, price, category);
        this.isProduce = isProduce;
        this.isFrozen = isFrozen;

    }

    @Override
    public void displayProductDetails() {
        //method to display product details
        System.out.println(name + "Has been selected " + " Product Details: "+ " Product: " + name + " Price:  " + price
                + " Category:  " + category + " Decor Type: "
              + " Produce: "  + isProduce + " Frozen:  " + isFrozen);

    }
}
