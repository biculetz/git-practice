package com.qa.model;

public class Dog extends Animal{
    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void sayHello() {
        System.out.println("Hi from "+this.getName());
    }

    @Override
    public String toString() {
        return "Dog details "+super.toString();
    }

    @Override
    public void move() {
        System.out.println("I'm moving..ruf");
    }

}
