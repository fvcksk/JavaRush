package com.javarush.task.task13.task1326;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/*
Сортировка четных чисел из файла
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        try {
            InputStream inputStream = new FileInputStream(scanner.nextLine());
            InputStreamReader isr = new InputStreamReader(inputStream);
            BufferedReader reader = new BufferedReader(isr);

            String str;
            while ((str = reader.readLine()) != null) {
                int n = Integer.parseInt(str);
                if (n % 2 == 0)
                    list.add(n);
            }
            reader.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        Collections.sort(list);
        for (Integer i : list)
            System.out.println(i);
    }
}
