package com.javarush.tasks.level6.finalTasks;
import java.util.ArrayList;

public class StaticCatsHard {

    public String name;

    public static ArrayList<StaticCatsHard> cats = new ArrayList<>();

    public StaticCatsHard(String name) {
        this.name = name;
    }

    public static void main(String[] args) {

        String [] arr = new String[] {"Vaska", "Petka", "Barsik", "Ryzhik", "Syrnik", "Tom", "Luna", "Bella", "Lucy", "Nala"};

        for (String name: arr) {
            cats.add(new StaticCatsHard(name));
        }
        printCats();
    }

    public static void printCats() {

        for ( StaticCatsHard j : cats){
            System.out.println(j);
        }

    }

    @Override
    public String toString() {
        return name;
    }
}
