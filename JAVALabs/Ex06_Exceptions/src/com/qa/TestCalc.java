package com.qa;

public class TestCalc {
    public static void main (String[] args){

        BadCalc bc = new BadCalc();

        System.out.println("mult result :" + bc.mult(2,3));

        try {
            System.out.println("div result :" + bc.div(6, 2));
        }catch (ArithmeticException ae){
            System.out.println("cant div with 0");
        }

    }

}
