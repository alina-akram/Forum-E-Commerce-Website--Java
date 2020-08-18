package edu.bu.met.cs665;

public class Apparel extends Product {
    private String seasonType;
    private String genderType;

    public Apparel(String name, double price, String category, String seasonType, String genderType){
        super(name,price,category);
        this.seasonType = seasonType;
        this.genderType = genderType;

    }

    @Override
    public void displayProductDetails() {
        System.out.println(name + "Has been selected " + " Product Details: "+ " Product: " + name + " Price:  " + price
                + ", Category:  " + category +  "  ,Season Type: "  +
                seasonType + " ,Gender:  " + genderType);



    }


}
