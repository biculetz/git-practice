package com.qa;

import java.sql.SQLOutput;
import java.util.Arrays;

public class Book {
    private String name;
    private String[] authors;
    private double price;

    public Book(String name, String[] authors, double price) {
        this.name = name;
        this.authors = authors;
        this.price = price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAuthors(String[] authors) {
        this.authors = authors;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String[] getAuthors() {
        return authors;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", authors=" + Arrays.toString(authors) +
                ", price=" + price +
                '}';
    }

}
