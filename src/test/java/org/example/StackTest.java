package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StackTest {

    @Test
    void insertEnd() {
        List list = new List(5);
        list.insertInto(0, 10);
    }

    @Test
    void removeLast() {
        List list = new List(5);
        list.removeAt(2);
    }
}