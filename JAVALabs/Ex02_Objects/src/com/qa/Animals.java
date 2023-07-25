package com.qa;

public class Animals {

    private String name;

    @Override
    public String toString() {
        return "Animals{" +
                "name='" + name + '\'' +
                ", owner='" + owner + '\'' +
                ", age=" + age +
                '}';
    }

    public String owner;
    private int age;

    public Animals(String name, String owner,int age){
        this.name = name;
        this.owner= owner;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getOwner() {
        return owner;
    }

    public int getAge() {
        return age;
    }
}
