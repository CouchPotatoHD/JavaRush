package com.javarush.tasks.finalTasks.BufferedReader;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.Buffer;

public class Summ {
    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the first digit: ");
        int a = Integer.parseInt(reader.readLine());
        System.out.println("Enter the second digit: ");
        int b = Integer.parseInt(reader.readLine());

        int sum = a + b;
        System.out.println("Sum = " + sum);
    }
}
