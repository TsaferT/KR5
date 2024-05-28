package org.example;
import java.util.*;
public class List {
    protected int[] arr;
    protected int size;
    protected int capacity;

    public List(int initialSize) {
        this.arr = new int[initialSize];
        this.capacity = initialSize;
        this.size = 0;
    }

    protected void ensureSize(int minSize) {
        if (minSize > capacity) {
            int newSize = Math.max(minSize, capacity * 2);
            int[] newArray = Arrays.copyOf(arr, newSize);
            arr = newArray;
            capacity = newSize;
        }
    }

    public void insertInto(int index, int value) {
        ensureSize(size + 1);
        System.arraycopy(arr, index, arr, index + 1, size - index);
        arr[index] = value;
        size++;
    }

    protected void removeAt(int index) {
        if (index >= size || index < 0) return;
        System.arraycopy(arr, index + 1, arr, index, size - index - 1);
        size--;
    }
}