/**
 * Alina Akram
 * Course CS-665
 * Summer 2
 * Term Project
 * August 18, 2020
 */

package edu.bu.met.cs665;

public class Director {

    String[][] productList;

    public Director(String[][] productList) {
        //constructor
        this.productList = productList;

    }

    public void Construct(Builder current, int num) {
        //Construct to create product
        String[] currentProduct = productList[num];
        if (currentProduct[2].equals("Household")) { //.equals for string comparison/look up operators ==/=
            current.buildHousehold(currentProduct[0], Double.parseDouble(currentProduct[1]), currentProduct[2],
                    currentProduct[3], Boolean.parseBoolean(currentProduct[4]));

        } else if (currentProduct[2].equals("Grocery")) {
            current.buildGrocery(currentProduct[0], Double.parseDouble(currentProduct[1]), currentProduct[2]
                    , Boolean.parseBoolean(currentProduct[3]), Boolean.parseBoolean(currentProduct[4]));

        } else if (currentProduct[2].equals("Apparel")) {
            current.buildApparel(currentProduct[0], Double.parseDouble(currentProduct[1])
                    , currentProduct[2], currentProduct[3], currentProduct[4]);

        }
    }
}
