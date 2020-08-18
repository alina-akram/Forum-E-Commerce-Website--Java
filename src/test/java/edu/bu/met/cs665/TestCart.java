/**
 * Alina Akram
 * Course CS-665
 * Summer 2
 * Final Project
 * August 18, 2020
 */
package edu.bu.met.cs665;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;


public class TestCart {
    @Test
    public void TestCart(){
        String[][] productList = {{"Clorox", "5.00", "Household", "Cleaning", "False"},
                {"Windex", "5.00", "Household", "Cleaning", "False"},
                {"Handbag", "20.00", "Apparel", "Spring", "Female"}};
        ProductBuilder builder = new ProductBuilder();
        //director/d needs pl
        Director director = new Director(productList);

        ArrayList<Product> products = new ArrayList<Product>();
        Cart cartInst = new Cart();

        for (int i = 0; i < productList.length; i++) {
            director.Construct(builder, i); //set up for what we want to build
            products.add(builder.getResult()); //adding proudcts to "products" list/gets product

        }
        cartInst.addToCart(products.get(1), quantity);
        cartInst.printCart();
        cartInst.removeFromCart(0, quantity);
        assert that cart is empty, expected: 0





    }

}
