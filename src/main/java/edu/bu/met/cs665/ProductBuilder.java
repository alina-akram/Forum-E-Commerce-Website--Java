/**
 * Alina Akram
 * Course CS-665
 * Summer 2
 * Term Project
 * August 18, 2020
 */
package edu.bu.met.cs665;

public class ProductBuilder implements Builder {
    Product currentProduct;

    public ProductBuilder(){
        //constructor

    }

    public Product getResult(){
        //method to get current product
        return currentProduct;

    }

    public void  buildGrocery(String name, double price, String category,boolean isProduce,boolean isFrozen){
        //method to build grocery instance
        currentProduct = new Grocery(name,price, category,isProduce,isFrozen);


    }

    public void  buildHousehold(String name, double price, String category, String decorType, boolean isPowered){
        //method to build household instance
        currentProduct = new Household(name, price, category, decorType, isPowered);

    }

    public void  buildApparel(String name, double price, String category, String seasonType, String genderType){
        //method to build Apparel instance
        currentProduct = new Apparel(name, price, category, seasonType, genderType );

    }

}
