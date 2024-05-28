package org.example;

public class Stack extends List {
    public Stack(int initialSize) {
        super(initialSize);
    }


    public void insertEnd(int value) {
        insertInto(size, value);
    }


    public void removeLast() {
        removeAt(size - 1);
    }

    public void push(int value) {
        insertEnd(value);
    }

    public int pop() {
        if (size == 0) throw new IllegalStateException("is empty");
        int lastElement = arr[size - 1];
        removeLast();
        return lastElement;
    }

    public boolean empty() {
        return size == 0;
    }
}


