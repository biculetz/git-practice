package com.qa.model;

public class Rabbit extends Animal{
    public Rabbit(String name, int age) {
        super(name, age);
    }

    @Override
    public void sayHello() {
        System.out.println("Hi from "+this.getName());
    }

    @Override
    public String toString() {
        return "Rabbit details "+super.toString();
    }

    @Override
    public void move() {
        System.out.println("I'm moving..");
    }

}
