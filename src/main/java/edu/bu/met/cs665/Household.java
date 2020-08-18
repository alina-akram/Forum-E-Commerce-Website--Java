package edu.bu.met.cs665;

public class Household extends Product{
    private String decorType;
    private boolean isPowered;

    public Household(String name, double price, String category, String decorType, boolean isPowered){
        super(name, price, category);
        this.decorType = decorType;
        this.isPowered = isPowered;

    }

    @Override
    public void displayProductDetails() {
        //ToDo fix the print format
        System.out.println(name + "Has been selected " + " Product Details: "+ " Product: " + name + " Price:  " + price
                + ", Category:  " + category + ",Decor Type: "
               + decorType + " Powered:  " + isPowered);



    }
}
