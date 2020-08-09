package com.company;

public class Main {

    //constructor
    public Main() {}

    //add
    public int add(int a, int b) {
        return a + b;
    }

    //subtract
    public int subtract(int a, int b) {
        return a - b;
    }

    //multiply
    public int multiply(int a, int b) {
        return a * b;
    }

    //divide
    public int divide(int a, int b) {
        return a / b;
    }

    public static void main(String[] args) {
        Main myCalculator = new Main();
        System.out.println(myCalculator.add(81, 62));
        System.out.println(myCalculator.subtract(812, 369));
        System.out.println(myCalculator.multiply(12, 24));
        System.out.println(myCalculator.divide(125, 5));
        System.out.println(myCalculator.multiply(358, 752));
    }
}
