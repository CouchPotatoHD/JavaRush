package com.javarush.tasks.level6.staticMethods;

public class StaticMethodsForCats {

    private static int catCount = 0;

    public StaticMethodsForCats() {
        catCount++;
    }

    public static int getCatCount() {
        return StaticMethodsForCats.catCount;
    }

    public static void setCatCount(int catCount) {
        StaticMethodsForCats.catCount = catCount;
    }

    public static void main(String[] args) {

    }

}
