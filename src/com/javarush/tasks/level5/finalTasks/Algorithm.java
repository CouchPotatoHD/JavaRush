package com.javarush.tasks.level5.finalTasks;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Algorithm {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(reader.readLine());

        if (N <= 0) {
            return;
        }

        int[] data = new int[N];
        for (int i = 0; i < N; i++) {
            data[i] = Integer.parseInt(reader.readLine());
        }

        int maximum = data[0];
        for (int i = 1; i < N; i++) {
            if (data[i] > maximum) {
                maximum = data[i];
            }
        }

        System.out.println(maximum);
    }

/*    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int maximum = 0;

        while (true) {
            String s = reader.readLine();

            if (s.equals("exit")){
                if (maximum > 0) {
                    System.out.println(maximum);
                }
                break;
            } else {
                int n = Integer.parseInt(s);
                if (n > maximum) {
                    maximum = n;
                }
            }
        }
    }*/
}
