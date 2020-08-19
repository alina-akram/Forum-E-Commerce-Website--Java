/**
 * Alina Akram
 * Course CS-665
 * Summer 2
 * Term Project
 * August 18, 2020
 */

package edu.bu.met.cs665;

import java.util.ArrayList;

public class Cart {
    private ArrayList<Product> cartItems;
    private ArrayList<Integer>quantityList;


    public Cart(){
        //constructor
        cartItems = new ArrayList<Product>();
        quantityList = new ArrayList<Integer>();
    }

    public void addToCart(Product p, int quantity){
        //adding item to cart
        if (cartItems.contains(p)){
            quantityList.set(cartItems.indexOf(p), quantity +
                    quantityList.get(cartItems.indexOf(p)));
        }
        else{
            cartItems.add(p);
            quantityList.add(quantity);
        }
    }

    public void  removeFromCart(int selection, int quantity){
        //remove item from cart
        if (selection >= 0 && selection < cartItems.size()){
            if (quantityList.get(selection) > quantity){
                quantityList.set(selection, quantityList.get(selection) - quantity);

            }
            else if(quantityList.get(selection) == quantity){
                cartItems.remove(selection);
                quantityList.remove(selection);
            }

        }
        else{
            return;
        }
    }

    public void checkout(){
        //method to check out cart and return total price

        double sumOfPrice = 0;

        for( int i = 0; i < cartItems.size(); i ++) {
            sumOfPrice += (cartItems.get(i)).getPrice();
        }
        System.out.println("Your cart is ready for checkout");
        printCart();
        System.out.println("Your total is: $ " + sumOfPrice);
        System.out.println("Thank you for shopping at Forum! We hope to see you again");

    }

    public void printCart(){
        //displays the cart items
        for (int i = 0; i < cartItems.size(); i++) {
            //displaying products
            System.out.print(i + "\t" + quantityList.get(i)+ "x ");
            cartItems.get(i).displayProductDetails();
        }

    }
}
