package com.sharjeelmk.encaps;

public class Cataloug{
    public String itemName;
    private int price;

    public void setPrice(int price) {
        this.price = price;
        System.out.println(this.price);
    }
}