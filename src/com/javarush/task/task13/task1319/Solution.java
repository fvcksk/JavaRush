package com.javarush.task.task13.task1319;

import java.io.*;
import java.util.Scanner;

/*
Писатель в файл с консоли
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(scanner.nextLine()))){
            String str;
            do {
                str = scanner.nextLine();
                writer.write(str);
                writer.newLine();
            } while (!str.equals("exit"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
