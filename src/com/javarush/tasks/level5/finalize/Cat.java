package com.javarush.tasks.level5.finalize;

public class Cat {
    public static int catCount = 0;

    public Cat(){
        this.catCount++;
    }

    protected void finalize() throws Throwable {
        this.catCount--;
    }

    public static void main(String[] args) {

    }
}
