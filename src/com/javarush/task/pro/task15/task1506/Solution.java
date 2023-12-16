package com.javarush.task.pro.task15.task1506;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

/*
Фейсконтроль
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        List<String> list = Files.readAllLines(Paths.get(scanner.nextLine()));

        for (String s : list) {
            for (int j = 0; j < s.toCharArray().length; j++) {
                char ch = s.charAt(j);
                if (ch == '.' || ch == ',' || ch == ' ') {
                    continue;
                }
                System.out.print(ch);
            }
        }
    }
}

