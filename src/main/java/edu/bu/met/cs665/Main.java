/**
 * Alina Akram
 * Course CS-665
 * Summer 2
 * Term Project
 * August 18, 2020
 */
package edu.bu.met.cs665;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    /**
     * A main method to run examples.
     *
     * @param args not used
     */
    public static void main(String[] args) {
        //constructor


        System.out.println("Welcome to Forum! Your one-stop shop for essentials. Please select your product from the following options to" +
                " add to your cart: ");

        String[][] productList = {{"Clorox", "5.00", "Household", "Cleaning", "False"},
                {"Windex", "5.00", "Household", "Cleaning", "False"},
                {"Handbag", "20.00", "Apparel", "Spring", "Female"}};

        ProductBuilder builder = new ProductBuilder();

        Director director = new Director(productList);

        ArrayList<Product> products = new ArrayList<Product>();
        Cart cartInst = new Cart(); // cart inst



        for (int i = 0; i < productList.length; i++) {
            director.Construct(builder, i);
            products.add(builder.getResult());

        }

        Scanner sc = new Scanner(System.in);
        addToCart(sc, products, cartInst);

        while (true) {
            System.out.println("What would you like to do now?");
            System.out.println("1: Add more products\n2: Delete a product from your cart\n3: Checkout");
            int cartSelection = sc.nextInt();
            if (cartSelection == 1) {
                addToCart(sc, products, cartInst);
            } else if (cartSelection == 2) {
                removeFromCart(sc, products, cartInst);
            } else if (cartSelection == 3) {
                cartInst.checkout();
                return;
            }
        }


    }

    public static void addToCart(Scanner sc, ArrayList<Product> products, Cart cartInst) {
        //method to add User selected product to cart

        for (int i = 0; i < products.size(); i++) {
            //displaying products
            System.out.print(i + "\t");
            products.get(i).displayProductDetails();
        }


        System.out.println("Which item would you like to add to your cart? Please enter the corresponding number");
        int selection = sc.nextInt();
        System.out.println("How many " + products.get(selection).getName() + " would you like to add? ");
        int quantity = sc.nextInt();
        System.out.println(quantity +" " + products.get(selection).getName() + " has been added");
        cartInst.addToCart(products.get(selection), quantity);
    }

    public static void removeFromCart(Scanner sc, ArrayList<Product> products, Cart cartInst) {
        //method to remove User selected product from cart
        cartInst.printCart();
        System.out.println("Which item would you like to remove from your cart? Please enter the corresponding number");
        int selection = sc.nextInt();
        System.out.println("How many would you like to remove?");
        int qtyToDelete = sc.nextInt();
        cartInst.removeFromCart(selection, qtyToDelete);

    }
}
