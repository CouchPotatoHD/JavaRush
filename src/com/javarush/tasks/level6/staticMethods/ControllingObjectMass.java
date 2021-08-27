package com.javarush.tasks.level6.staticMethods;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ControllingObjectMass {

    public static void main(String[] args) throws IOException {
        BufferedReader bis = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter weight: ");

        double weight = Double.parseDouble(bis.readLine());

        System.out.println("Enter height: ");

        double height = Double.parseDouble(bis.readLine());

        Body.calculateMassIndex(weight, height);
    }

    public static class Body {
        public static void calculateMassIndex(double weight, double height) {

            String result;

            double low = 18.5;
            double normal = 25;
            double Extra = 30;
            double massIndex = weight/(height*height);

            if (massIndex < low){
                result = "Недовес: меньше чем 18.5";
            } else if (massIndex >= low && massIndex < normal){
                result = "Нормальный: между 18.5 и 25";
            } else if (massIndex >= normal && massIndex < Extra){
                result = "Избыточный вес: между 25 и 30";
            } else if (massIndex > Extra){
                result = "Ожирение: 30 или больше";
            }
            else {
                result = "Error";
            }

            System.out.println(result);

        }
    }
}
