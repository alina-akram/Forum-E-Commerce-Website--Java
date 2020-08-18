package edu.bu.met.cs665;

public abstract class Product {
    //instance var dec
    //protected means it'll still be abstracted but be accessible to it's child classes/ private wouldn't have allowed this.var
    protected String name;
    protected double price;
    protected String category;

    public Product(String name, double price, String category){
        //constructer
        this.name = name;
        this.price = price;
        this.category = category;
    }


    public abstract void displayProductDetails();

    public double getPrice() {
        return price;
    }
    public String getName(){
        return name;
    }
}
