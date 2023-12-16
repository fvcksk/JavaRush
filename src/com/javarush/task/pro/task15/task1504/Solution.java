package com.javarush.task.pro.task15.task1504;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

/*
Перепутанные байты
*/

public class Solution {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in);
             InputStream newInputStream = Files.newInputStream(Paths.get(scanner.nextLine()));
             OutputStream newOutputStream = Files.newOutputStream(Paths.get(scanner.nextLine()))) {
            while (newInputStream.available() > 0) {
                int n2 = newInputStream.read();
                int n1 = newInputStream.read();
                if (n1 != -1) {
                    newOutputStream.write(n1);
                }
                if (n2 != -1) {
                    newOutputStream.write(n2);
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}