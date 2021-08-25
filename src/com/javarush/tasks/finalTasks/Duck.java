package com.javarush.tasks.finalTasks;

public class Duck {

    public static void main(String[] args) {
        Duckk duck1 = new Duckk();
        Duckk duck2 = new Duckk();
        Cat cat1 = new Cat();
        Cat cat2 = new Cat();
        Dog dog1 = new Dog();
        Dog dog2 = new Dog();
        System.out.println(duck1);
        System.out.println(duck2);
        System.out.println(cat1);
        System.out.println(cat2);
        System.out.println(dog1);
        System.out.println(dog2);
    }

    public static class Duckk {
        public String toString() {
            return "Duck";
        }
    }

    public static class Cat {
        public String toString() {
            return "Cat";
        }
    }

    public static class Dog {
        public String toString() {
            return "Dog";
        }
    }
}