package com.javarush.tasks.initializing;

public class Rectangle {

    int top, left, width, height;

    public void initialize (int left, int top, int width, int height) {
        this.left = left;
        this.top = top;
        this.width = width;
        this.height = height;

    }

    public void initialize (int left, int top) {
        this.left = left;
        this.top = top;
        this.height = 0;
        this.width = 0;

    }

    public void initialize (int left, int top,int width) {
        this.left = left;
        this.top = top;
        this.width = width;
        this.height = width;


    }

    public void initialize (Rectangle r) {
        this.left = r.left;
        this.top = r.top;
        this.width = r.width;
        this.height = r.height;
    }

    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle();
        rectangle.initialize(1,2,1,2);

    }
}
