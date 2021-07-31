package com.sharjeelmk;
import com.sharjeelmk.encaps.Cataloug;
public class Main {

    public static void main(String[] args) {
        Cataloug book = new Cataloug();
        book.itemName="Cracking the COding Interview By Gyale";
        book.setPrice(600);
        System.out.println(book.itemName);
        book.setPrice(600);
    }
}

