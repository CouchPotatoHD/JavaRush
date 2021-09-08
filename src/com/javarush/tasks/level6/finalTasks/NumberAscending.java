package com.javarush.tasks.level6.finalTasks;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class NumberAscending {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int[] numbersArray = new int[5];

        for (int i = 0; i< numbersArray.length; i++){
            int number = Integer.parseInt(reader.readLine());
            numbersArray[i] = number;
        }

        for(int j = 0; j < numbersArray.length - 1; j++){

            for (int k = 0; k < numbersArray.length - 1; k++)
            {
                if (numbersArray[k] > numbersArray[k + 1])
                {
                    int tempNumber = numbersArray[k];
                    numbersArray[k] = numbersArray[k + 1];
                    numbersArray[k + 1] = tempNumber;
                }
            }

        }
        for (int i : numbersArray) {
            System.out.println(i);
        }

    }
}
