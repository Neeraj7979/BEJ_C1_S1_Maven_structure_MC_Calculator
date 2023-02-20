package com.niit.bej;

public class Main {
    public static void main(String[] args) {

        Calculator calculator=new Calculator();

        double addTwoNumber= calculator.add(5,10);
        System.out.println(addTwoNumber);

        double subtractTwoNumber= calculator.sub(5,10);
        System.out.println(subtractTwoNumber);

        double multiplyTwoNumber= calculator.multiply(5,10);
        System.out.println(multiplyTwoNumber);

        double divideTwoNumber= calculator.divide(5,10);
        System.out.println(divideTwoNumber);
    }
}