package com.javarush.task.pro.task14.task1415;

import java.util.LinkedList;
import java.util.List;

/*
Стек в домашних условиях
*/

public class MyStack {

    private final List<String> storage = new LinkedList<>();

    public void push(String s) {
        storage.add(s);
    }

    public String pop() {
        return storage.remove(storage.size() - 1);
    }

    public String peek() {
        return storage.get(storage.size() - 1);
    }

    public boolean empty() {
        return storage.isEmpty();
    }

    public int search(String s) {
        return storage.indexOf(s);
    }
}
