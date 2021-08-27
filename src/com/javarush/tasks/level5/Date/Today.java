package com.javarush.tasks.level5.Date;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Today {

    public static void main(String[] args) {

        Calendar calendar = Calendar.getInstance();

        SimpleDateFormat formatter = new SimpleDateFormat("dd MM yyyy");
        System.out.println(formatter.format(calendar.getTime()));

    }
}
