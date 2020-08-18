package edu.bu.met.cs665;

public interface Builder {
    //builder interface

    public Product getResult();
    public void  buildGrocery(String name, double price, String category,boolean isProduce,boolean isFrozen);
    public void  buildHousehold(String name, double price, String category, String decorType, boolean isPowered);
    public void  buildApparel(String name, double price, String category, String seasonType, String genderType);

}
