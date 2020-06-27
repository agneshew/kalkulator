package com.example;

public class Calculator {

    public void addAToB(double a, double b) {
        System.out.println(a + b);
    }
    public double subtractionAFromB(double a, double b) {
        return b - a;
    }
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.addAToB(5, 23);
        System.out.println(calculator.subtractionAFromB(456.678, 12.234));
        System.out.println("It works!");
    }
}
