/**
 * Alina Akram
 * Course CS-665
 * Summer 2
 * Term Project
 * August 18, 2020
 */
package edu.bu.met.cs665;

public interface Builder {
    //builder interface with required method headers

    public Product getResult();
    public void  buildGrocery(String name, double price, String category,boolean isProduce,boolean isFrozen);
    public void  buildHousehold(String name, double price, String category, String decorType, boolean isPowered);
    public void  buildApparel(String name, double price, String category, String seasonType, String genderType);

}
