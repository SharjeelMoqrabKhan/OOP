package com.sharjeelmk.classes_objects;
public class Person{
public String name;
public int age;
public static int count;

public Person(){
    count++;
}

public Person(String name,int age){
        this();
        this.name=name;
        this.age=age;
    }


public void greetings(){
    System.out.println("Howdy");
}

public void greetings(String name){
    System.out.println("Howdy"+name);
}

}