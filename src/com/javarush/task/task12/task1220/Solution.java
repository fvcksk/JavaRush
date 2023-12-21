package com.javarush.task.task12.task1220;

/*
Класс Human и интерфейсы CanRun, CanSwim
*/

public class Solution {
    public static void main(String[] args) {

    }

    public interface CanRun{
        boolean canRun();
    }

    public interface CanSwim {
        boolean canSwim();
    }

    public abstract class Human implements CanRun, CanSwim {

    }
}
