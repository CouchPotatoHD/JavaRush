package com.javarush.tasks.compare;


public class Dog implements Comparable<Dog>{

    private String name;

    public void setName(String name)
    {
        this.name = name;
    }
    public String getName()
    {
        return this.name;
    }

    public int compareTo(Dog anotherDog){
        return name.compareTo(anotherDog.getName());
    }

    public static void main(String[] args) {

        Dog dog1 = new Dog();
        dog1.setName("Bobba");
        Dog dog2 = new Dog();
        dog2.setName("Abba");

        System.out.println(dog1.compareTo(dog2));

    }

}
