package com.javarush.tasks.level6.finalTasks;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class KissMy {

 /*  public static class KissMyShinyMetalAss {
    }

    public static void main(String[] args) {
        KissMyShinyMetalAss ass1 = new KissMyShinyMetalAss();
        System.out.println(ass1);
    }
*/
    public static int max = 100;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String max = "The max is ";
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int max2 = a > b ? a : b;

        System.out.println(max + max2);
    }

}
