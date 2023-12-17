package com.javarush.task.pro.task16.task1604;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;

/*
День недели рождения твоего
*/

public class Solution {

    static Calendar birthDate = new GregorianCalendar(2004, 7, 10);

    public static void main(String[] args) {
        System.out.println(getDayOfWeek(birthDate));
    }

    static String getDayOfWeek(Calendar calendar) {
        SimpleDateFormat format = new SimpleDateFormat("EEEE", new Locale("ru", "RU"));
        String str = format.format(calendar.getTime());

        return str;
    }
}
