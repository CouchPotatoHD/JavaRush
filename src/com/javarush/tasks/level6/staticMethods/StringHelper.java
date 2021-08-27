package com.javarush.tasks.level6.staticMethods;

public class StringHelper {

    public static String multiply(String text) {
        String result = "";
        for (int cnt = 0; cnt<5;cnt++){
            result += text;
        }
        return result;
    }

    public static String multiply(String text, int count) {
        String result = "";
        for (int cnt = 0; cnt<count;cnt++){
            result += text;
        }
        return result;
    }

    public static void main(String[] args) {

        System.out.println(multiply("Meg"));

        System.out.println(multiply("Hell",3));

    }
}
