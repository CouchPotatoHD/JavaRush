package com.javarush.tasks.level6.finalTasks;

public class NewIdeasNotepad {

    public static void printIdea(Idea idea){
        System.out.println(idea.getDescription());
    }

    public static class Idea{

        public String getDescription(){
            return "Idea";
        }
    }

    public static void main(String[] args) {
        printIdea(new Idea());
    }

}
