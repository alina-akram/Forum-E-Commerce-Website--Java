package edu.bu.met.cs665;

public class Grocery extends Product{
    private boolean isProduce;
    private boolean isFrozen;


    public Grocery(String name, double price, String category,boolean isProduce,boolean isFrozen){
        //consturcter
        super(name, price, category);
        this.isProduce = isProduce;
        this.isFrozen = isFrozen;

    }

    @Override
    public void displayProductDetails() {
        System.out.println(name + "Has been selected " + " Product Details: "+ " Product: " + name + " Price:  " + price
                + ", Category:  " + category + ",Decor Type: "
              + ", Produce: "  + isProduce + " Frozen:  " + isFrozen);

    }
}
