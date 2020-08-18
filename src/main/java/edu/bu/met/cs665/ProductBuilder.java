package edu.bu.met.cs665;

public class ProductBuilder implements Builder {
    Product currentProduct;

    public ProductBuilder(){
        //constructer

    }

    public Product getResult(){
        return currentProduct;

    }

    public void  buildGrocery(String name, double price, String category,boolean isProduce,boolean isFrozen){
        currentProduct = new Grocery(name,price, category,isProduce,isFrozen); //grocery product instance


    }

    public void  buildHousehold(String name, double price, String category, String decorType, boolean isPowered){
        currentProduct = new Household(name, price, category, decorType, isPowered); //household product instance

    }

    public void  buildApparel(String name, double price, String category, String seasonType, String genderType){
        currentProduct = new Apparel(name, price, category, seasonType, genderType );//Apparel product instance


    }


}
