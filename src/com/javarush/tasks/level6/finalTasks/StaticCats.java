package com.javarush.tasks.level6.finalTasks;

public class StaticCats {

    public static void main(String[] args) {

        for (int i = 0; i<10; i++){
            Cat cat = new Cat();
        }

        System.out.println(Cat.catCount);

    }

    private static class Cat {
        private static int catCount = 0;

        public Cat(){
            catCount++;
        }

    }

}
