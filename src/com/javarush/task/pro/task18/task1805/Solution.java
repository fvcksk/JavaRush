package com.javarush.task.pro.task18.task1805;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/*
Прощание с лямбда-выражением
*/

public class Solution {

    public static void main(String[] args) {
        var strings = new ArrayList<String>();

        Collections.addAll(strings, "JavaRush", "Amigo", "Java Developer", "CodeGym");

        sortStringsByLength(strings);

        for (String string : strings) {
            System.out.println(string);
        }
    }

    public static void sortStringsByLength(ArrayList<String> strings) {
        Collections.sort(strings, new StringComparator());
    }
}

class StringComparator implements Comparator<String> {
    @Override
    public int compare(String s1, String s2) {
        return s1.length() - s2.length();
    }
}
