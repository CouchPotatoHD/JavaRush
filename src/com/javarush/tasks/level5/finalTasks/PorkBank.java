package com.javarush.tasks.level5.finalTasks;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class PorkBank {
    public static void main(String[] args) throws Exception {
        int sum = 0;
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        while (true)
        {
            String s = buffer.readLine();
            if (s.equals("сумма")) {
                System.out.println(sum);
                break;
            } else {
                int digit = Integer.parseInt(s);
                sum = sum + digit;
            }
        }
    }
}
