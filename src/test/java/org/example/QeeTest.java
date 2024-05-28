package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QeeTest {

    @Test
    void insertEnd() {
        List list = new List(5);
        list.insertInto(0, 3);
    }

    @Test
    void removeLast() {
        List list = new List(5);
        list.removeAt(3);
    }

    @Test
    void enqee() {
        List list = new List(5);
    }

    @Test
    void deqee() {
        List list = new List(5);
        list.size();
    }

}