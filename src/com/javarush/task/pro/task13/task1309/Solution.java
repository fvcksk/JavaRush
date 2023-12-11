package com.javarush.task.pro.task13.task1309;

import java.util.HashMap;

/*
Успеваемость студентов
*/

public class Solution {
    public static HashMap<String, Double> grades = new HashMap<>();

    public static void main(String[] args) {
        addStudents();
        System.out.println(grades);
    }

    public static void addStudents() {
        grades.put("q", 1.0);
        grades.put("t", 1.0);
        grades.put("r", 1.0);
        grades.put("e", 1.0);
        grades.put("w", 1.0);
    }
}
