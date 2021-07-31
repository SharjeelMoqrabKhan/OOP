package com.sharjeelmk;

import com.sharjeelmk.classes_objects.Person;

public class Main {

    public static void main(String[] args) {
        Person p1 = new Person();
        Person p2= new Person("Gyale",28);
        p1.name="Shareel";
        p1.age=25;
        System.out.println(p1.name);
        System.out.println(p1.age);
        p1.greetings();
        p1.greetings(p1.name);
        System.out.println(Person.count);
        System.out.println(p2.name);
        System.out.println(p2.age);
    }
}

