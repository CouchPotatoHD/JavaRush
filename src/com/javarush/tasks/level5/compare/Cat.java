package com.javarush.tasks.level5.compare;

public class Cat implements Comparable<Cat>{

    private String name;
    private int age, weight, strength;

    public int compareTo(Cat anotherCat) {

        return Integer.compare(this.getAge(), anotherCat.getAge())+ Integer.compare(this.getWeight(),anotherCat.getWeight())
                + Integer.compare(this.getStrength(),anotherCat.getStrength());
    }

    public static void main(String[] args) {

        Cat cat1 = new Cat();

        cat1.setName("Vasiliy");
        cat1.setAge(2);
        cat1.setWeight(10);
        cat1.setStrength(100);

        Cat cat2 = new Cat();

        cat2.setName("Petka");
        cat2.setAge(2);
        cat2.setWeight(9);
        cat2.setStrength(100);

        System.out.println(cat1.compareTo(cat2));

    }


    //getters and setters
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return this.age;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getWeight() {
        return this.weight;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getStrength() {
        return this.strength;
    }

    //getters and setters
}
