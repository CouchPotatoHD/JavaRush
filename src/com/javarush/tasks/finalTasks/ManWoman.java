package com.javarush.tasks.finalTasks;

public class ManWoman {

    public static void main(String[] args) {

        Man man1 = new Man("Aleksandr", 35, "Ukraine, Kiev");
        Man man2 = new Man("Petr", 42, "Ukraine, Kharkov");
        Woman woman1 = new Woman("Svetlana", 25, "Ukraine, Kiev");
        Woman woman2 = new Woman("Yelizaveta",20,"Ukraine, Kharkov");

        System.out.println(man1.getName() + " " + man1.getAge() + " " + man1.getAddress());
        System.out.println(man2.getName() + " " + man2.getAge() + " " + man2.getAddress());
        System.out.println(woman1.getName() + " " + woman1.getAge() + " " + woman1.getAddress());
        System.out.println(woman2.getName() + " " + woman2.getAge() + " " + woman2.getAddress());

    }

    public static class Man{

        String name, address;
        int age;

        public Man (String name, int age, String address){
            this.name = name;
            this.age = age;
            this.address = address;
        }

        public void setName(String name){
            this.name = name;
        }

        public void setAge(int age){
            this.age = age;
        }

        public void setAddress(String address){
            this.address = address;
        }

        public String getName(){
            return this.name;
        }

        public int getAge(){
            return this.age;
        }

        public String getAddress(){
            return this.address;
        }
    }


    public static class Woman{

        String name, address;
        int age;

        public Woman (String name, int age, String address) {
            this.name = name;
            this.age = age;
            this.address = address;
        }

        public void setName(String name){
            this.name = name;
        }

        public void setAge(int age){
            this.age = age;
        }

        public void setAddress(String address){
            this.address = address;
        }

        public String getName(){
            return this.name;
        }

        public int getAge(){
            return this.age;
        }

        public String getAddress(){
            return this.address;
        }

    }

}
