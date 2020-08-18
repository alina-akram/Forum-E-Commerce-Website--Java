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
        //constructer
        //test product build
        //1:we have hard-coded 4-5 products /2:Welcome message/ 3: user needs to be able to choose their product user input
        // in main with a number from the displayed list of products detials for each/
        //can add to cart from there/display cart before checking out?
        //product list:
        //household

        //welcome message
        System.out.println("Welcome to this ecommerce website. Please select your product from the following options to" +
                " add to your cart: ");

        //create list of products/builder pattern to create priduct instances
        //test
        String[][] productList = {{"Clorox", "5.00", "Household", "Cleaning", "False"},
                {"Windex", "5.00", "Household", "Cleaning", "False"},
                {"Handbag", "20.00", "Apparel", "Spring", "Female"}};
        //inst

        ProductBuilder builder = new ProductBuilder();
        //director/d needs pl
        Director director = new Director(productList);

        ArrayList<Product> products = new ArrayList<Product>();
        Cart cartInst = new Cart(); // cart inst

        //direct.construct/builder.getreust method
        //populate the products arraylsit


        for (int i = 0; i < productList.length; i++) {
            director.Construct(builder, i); //set up for what we want to build
            products.add(builder.getResult()); //adding proudcts to "products" list/gets product

        }
        //for test

        // input number
        //cartInst.addToCart(products.get(1), quantity);
        //cartInst.printCart();
        //cartInst.removeFromCart(0, quantity);
        //assert that cart is empty, expected: 0

        Scanner sc = new Scanner(System.in);
        addToCart(sc, products, cartInst); //adding product and qty to cart

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

        for (int i = 0; i < products.size(); i++) {
            //displaying products
            System.out.print(i + "\t");
            products.get(i).displayProductDetails();
        }


        System.out.println("Which item would you like to add to your cart? Please enter the corresponding number");
        int selection = sc.nextInt();
        System.out.println("How many " + products.get(selection).getName() + " would you like to add? ");
        int quantity = sc.nextInt(); //enters qty of products
        System.out.println(quantity + products.get(selection).getName() + " has been added");
        cartInst.addToCart(products.get(selection), quantity);
    }

    public static void removeFromCart(Scanner sc, ArrayList<Product> products, Cart cartInst) {
        cartInst.printCart();//showing cart
        System.out.println("Which item would you like to remove from your cart? Please enter the corresponding number");
        int selection = sc.nextInt(); //action item number
        System.out.println("How many would you like to remove?");
        int qtyToDelete = sc.nextInt();
        cartInst.removeFromCart(selection, qtyToDelete);

    }
}
