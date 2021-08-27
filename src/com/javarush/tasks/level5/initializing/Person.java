package com.javarush.tasks.level5.initializing;

public class Person {

    private String name;
    private int age;

    public static void main(String[] args) {
        Person human1 = new Person();
        human1.initialize("Petya",35);
    }

        public void initialize(String name, int age){
            this.name = name;
            this.age = age;
    }
}