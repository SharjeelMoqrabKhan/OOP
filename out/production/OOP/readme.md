# Object-oriented programming
An object-oriented programming is a way programming which enables programmers to think like they are working with real-life entities(a thing with distinct and independent existence) or objects. In real-life, people have knowledge and can do various works. In OOP, objects have fields to store knowledge/state/data and can do various works — methods.

## Basic Terminologies:
###Object:
It’s the instance of a class/ it’s the working entity of a class.
###Class:
It is a template or blue print about the capability of what an object can do.
###Method:
The behaviours of a class. It tells what a method can do.
###Instance:
Object and Instance both are same with small difference.
A blueprint for a house design is like a class description. All the houses built from that blueprint are objects of that class. A given house is an instance.

**A blueprint for a house design is like a class description. All the houses built from that blueprint are objects of that class. A given house is an instance.**

<img src="https://miro.medium.com/max/700/1*MI77xr4aL6MnU-MrNqJQ2g.png"/>
<img src="https://miro.medium.com/max/700/1*9aK2AU3vlIz8KEHciGsNSg.png"/>

## OOPs Concepts:
1) Encapsulation
2) Abstraction
3) Polymorphism
4) Inheritance

## Polymorphism
In object-oriented programming, polymorphism (from the Greek meaning “having multiple forms”) is the characteristic of being able to assign a different meaning or usage to something in different contexts — specifically, to allow an entity such as a function, or an object to have more than one.
### In Object-Oriented Programming (OOPS) language, there are two types of polymorphism as below:
1) Static Binding (or Compile time) Polymorphism, e.g., Method Overloading.
````
package com.sharjeelmk.classes_objects;
public class Person{
public String name;
public int age;

public void greetings(){
    System.out.println("Howdy");
}

public void greetings(String name){
    System.out.println("Howdy"+name);
}

}
````

2) Dynamic Binding (or Runtime) Polymorphism, e.g., Method overriding.
Bassed on inheritance 
```
ackage com.sharjeelmk.classes_objects;
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


```

## Constructor 
A constructor in Java is a special method that is used to initialize objects. The constructor is called when an object of a class is created. It can be used to set initial values for object attributes:
```
package com.sharjeelmk.classes_objects;
public class Person{
public static int count;
public Person(){
    count++;
}
}

package com.sharjeelmk;

import com.sharjeelmk.classes_objects.Person;

public class Main {
    public static void main(String[] args) {
        Person p1 = new Person();
        System.out.println(Person.count);
    }
}
```

### Constructor Over Loading
it is used for one then one constructor
```
package com.sharjeelmk.classes_objects;
public class Person{
public static int count;
public Person(){
    count++;
}
public Person(String newName,int newAge){
        name=newName;
        age=newAge;
}
}

package com.sharjeelmk;

import com.sharjeelmk.classes_objects.Person;

public class Main {
    public static void main(String[] args) {
        Person p1 = new Person();
        Person p2= new Person("Gyale",28);
        System.out.println(Person.count);
    }
}
```

## This 
this can used in java for calling one contructor to another constructor also this is used to intial the value to same name varibales but different scope 
```
package com.sharjeelmk.classes_objects;
public class Person{
public static int count;
public Person(){
    count++;
}
public Person(String newName,int newAge){
        this();
        name=newName;
        age=newAge;
}
}

package com.sharjeelmk;

import com.sharjeelmk.classes_objects.Person;

public class Main {
    public static void main(String[] args) {
        Person p1 = new Person();
        Person p2= new Person("Gyale",28);
        System.out.println(Person.count);
    }
}
```

```
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
```
package com.sharjeelmk.classes_objects;

public class Developer extends Person {
public Developer(String name,int age){
    super(name,age); //super is ues for calling parent constructor
}
    public void greetings(){
        System.out.println("Howdy dev");
    }
}

```

```

## Inheritance 
nheritance in Java is a concept that acquires the properties from one class to other classes; for example, the relationship between father and son. 

In Java, a class can inherit attributes and methods from another class. The class that inherits the properties is known as the sub-class or the child class. The class from which the properties are inherited from is know as the superclass or the parent class.

In Inheritance, the properties of the base class is acquired by the derived classes.

```
ackage com.sharjeelmk.classes_objects;
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

package com.sharjeelmk.classes_objects;

public class Developer extends Person {
public Developer(String name,int age){
    super(name,age); //super is ues for calling parent constructor
}
    public void greetings(){
        System.out.println("Howdy dev");
    }
}

```

## Encapsulation 
it is use for encapsul the properties and methods and
for data protecting we use packages and access modifers
Access Modifer 
1) Public-> Access anywhere 
2) Private-> Only accessable in class
3) Protected-> Only accessable childern class from parent
Getter and setter is use for using private data 