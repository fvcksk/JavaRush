package com.javarush.task.task13.task1318;

import java.io.*;
import java.util.Scanner;

/*
Чтение файла
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        FileInputStream fileInputStream = new FileInputStream(scanner.nextLine());
        InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        while (bufferedReader.ready()) {
            System.out.println(bufferedReader.readLine());
        }
        fileInputStream.close();
        inputStreamReader.close();
        bufferedReader.close();
    }
}