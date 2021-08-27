package com.javarush.tasks.level5.initializing;

public class Cat {

    String name, address, color;
    int age, weight;

    public void initialize(String name){
        this.name = name;
        this.color = "Grey";
        this.age = 1;
        this.weight = 3;
        this.address = null;
    }

    public void initialize(String name, int weight, int age){
        this.name = name;
        this.color = "Grey";
        this.age = age;
        this.weight = weight;
        this.address = null;
    }

    public void initialize(String name, int age){
        this.name = name;
        this.color = "Grey";
        this.age = age;
        this.weight = 3;
        this.address = null;
    }

    public void initialize(int weight, String color){
        this.name = null;
        this.color = color;
        this.age = 1;
        this.weight = weight;
        this.address = null;
    }

    public void initialize(int weight, String color, String address){
        this.name = null;
        this.color = color;
        this.age = 1;
        this.weight = weight;
        this.address = address;
    }

    public static void main(String[] args) {

        Cat cat = new Cat();


    }
}
