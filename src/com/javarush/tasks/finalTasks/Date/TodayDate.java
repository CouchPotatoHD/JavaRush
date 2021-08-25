package com.javarush.tasks.finalTasks.Date;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TodayDate {

    public static void main(String[] args) {

        Date currDate = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("dd MM yyyy");
        System.out.println(formatter.format(currDate));

    }

}
