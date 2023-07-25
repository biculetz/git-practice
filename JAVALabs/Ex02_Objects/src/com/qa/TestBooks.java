package com.qa;

public class TestBooks {
    public static void main(String[] args){

        String[] arr = {"Mike", "Martina", "Peter"};
        Book b1 = new Book("title",arr,2.00);
        Book b2 = new Book("title1",arr,7.29);
        Book b3 = new Book("title2",arr,4.68);

        /*System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);*/

        Book[] bookArray = new Book[3];
        bookArray[0] = b1;
        bookArray[1] = b2;
        bookArray[2] = b3;

        /*for (int i = 0; i< bookArray.length;i++){
            System.out.println(bookArray[i]);
        }*/

        Animals[] zoo = new Animals[3];
        zoo[0] = new Animals("Zebra","mike",3);
        zoo[1] = new Animals("dog","Ana",6);
        zoo[2] = new Animals("cat","Cristian",9);

        for (int i = 0; i < zoo.length; i++ ){
            System.out.println(zoo[i]);
        }

        zoo[1].owner = "Riky";
        zoo[1].setName("Frog");

        System.out.println("-------------------------------------------");

        for (int i = 0; i < zoo.length; i++ ){
            System.out.println(zoo[i]);
        }


        float sum = 0;
        float average = 0;


        for (int i = 0; i < zoo.length; i++ ){
            sum += zoo[i].getAge();
            average = sum / zoo.length;
        }

        System.out.println("Average = " + average);
        

    }
}
