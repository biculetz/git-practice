package com.qa.model;

public class Cat extends Animal{

    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public void sayHello() {
        System.out.println("Hi from "+this.getName());
    }

    @Override
    public String toString() {
       return "Cat details "+super.toString();
    }

    @Override
    public void move() {
        System.out.println("I'm moving..meow");
    }

}
