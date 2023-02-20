package com.niit.bej;

public class Calculator {
    public double add(int num1, int num2) {
        return num1 + num2;
    }

    public double sub(double num1, double num2) {
        if (num1 > num2) {
            return num1 - num2;
        } else return num2 - num1;
    }
    public double multiply(double num1, double num2) {
        return num1 * num2;
    }
    public double divide(double divisor, double dividend) {
        if (divisor == 0) {
            return 0;
        } else {
            return dividend / divisor;
        }
    }







}
