package com.javarush.tasks.level6.staticMethods;

public class Calculator {

    public static int plus(int a, int b) {
        return a+b;
    }

    public static int minus(int a, int b) {
        return a-b;
    }

    public static int multiply(int a, int b) {
        return a*b;
    }

    public static double division(int a, int b) {
        return ((double) a)/b;
    }

    public static double percent(int a, int b) {
       return  (((double) b)*a) / 100;
    }

    public static void main(String[] args) {

        System.out.println(percent(4,50));

    }

}
