package com.sharjeelmk.abstruction;

public abstract class Car {
int price;
abstract void start();
}

class Audi extends  Car{
    @Override
    void start() {
        System.out.println("Audi Start");
    }
}

class BMW extends  Car{
    @Override
    void start() {
        System.out.println("BMW Start");
    }
}