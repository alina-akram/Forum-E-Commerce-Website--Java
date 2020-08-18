package edu.bu.met.cs665;

import java.util.ArrayList;

public class Cart {
    private ArrayList<Product> cartItems;
    private ArrayList<Integer>quantityList;


    public Cart(){
        //constructer
        cartItems = new ArrayList<Product>(); //AL constructur
        quantityList = new ArrayList<Integer>();


    }

    public void addToCart(Product p, int quantity){
        //check item existence
        if (cartItems.contains(p)){
            quantityList.set(cartItems.indexOf(p), quantity +
                    quantityList.get(cartItems.indexOf(p))); //gets index of item p/sets corresponding quantity

        }
        else{
            cartItems.add(p);
            quantityList.add(quantity);

        }

//        cartItems.add(p); //adding p to our list

    }

    public void  removeFromCart(int selection, int quantity){
        if (selection >= 0 && selection < cartItems.size()){ //existence
            //check qty
            if (quantityList.get(selection) > quantity){
                quantityList.set(selection, quantityList.get(selection) - quantity);

            }
            else if(quantityList.get(selection) == quantity){
                cartItems.remove(selection);
                quantityList.remove(selection);

            }
//            quantityList.set(cartItems.indexOf(p), quantity +
//                    quantityList.get(cartItems.indexOf(p))); //gets index of item p/sets corresponding quantity

        }
        else{
            return;

        }



    }

    public void checkout(){
        //returns price

        double sumOfPrice = 0;

        for ( int i = 0; i < cartItems.size(); i ++){
            sumOfPrice += (cartItems.get(i)).getPrice();

        }
        System.out.println("Your cart is ready for checkout");
        printCart();
        System.out.println("Your total is: $ " + sumOfPrice);

    }

    public void printCart(){ //void because printing not returning
        for (int i = 0; i < cartItems.size(); i++) {
            //displaying products
            System.out.print(i + "\t" + quantityList.get(i)+ "x ");
            cartItems.get(i).displayProductDetails();
        }

    }



}
