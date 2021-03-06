package com.javarush.tasks.level5.finalTasks.BufferedReader;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Minimal {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());
        int d = Integer.parseInt(reader.readLine());
        int e = Integer.parseInt(reader.readLine());

        int minimum = min(a, b, c, d, e);

        System.out.println("Minimum = " + minimum);
    }


    public static int min(int a, int b, int c, int d, int e) {

        int[] numbersList = {a, b, c, d, e};
        int min = numbersList[0];

        for (int i : numbersList) {

            if (i < min) {
                min = i;
            }
        }
        return min;
    }

}
