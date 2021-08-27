package com.javarush.tasks.level5.finalize;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EvenOddNumbers {

    public static int even;
    public static int odd;

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String sNumber = reader.readLine();

        int Digit;

        for (int cnt = 0; cnt < sNumber.length();cnt++){

            Digit = sNumber.charAt(cnt);

            if (Digit % 2 == 0)
            {
                even++;
            } else {
                odd++;
            }
        }

        System.out.println("Even: " + even + " " + "Odd: " + odd);
    }
}
