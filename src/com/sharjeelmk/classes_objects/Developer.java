package com.sharjeelmk.classes_objects;

public class Developer extends Person {
public Developer(String name,int age){
    super(name,age); //super is ues for calling parent constructor
}
    public void greetings(){
        System.out.println("Howdy dev");
    }
}
