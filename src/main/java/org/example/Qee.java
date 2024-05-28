package org.example;

public class Qee extends List {
    public Qee(int initialSize) {
        super(initialSize);
    }


    public void insertEnd(int value) {
        insertInto(size, value);
    }


    public void removeLast() {
        removeAt(0);
    }

    public void enqee(int value) {
        insertEnd(value);
    }

    public int deqee() {
        if (size == 0) throw new IllegalStateException("is empty");
        int firstElement = arr[0];
        removeLast();
        return firstElement;
    }

    public boolean empty() {
        return size == 0;
    }
}
