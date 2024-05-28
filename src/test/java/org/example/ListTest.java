package org.example;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ListTest {

    @Test
    void insertInto() {
        List list = new List(5);
        list.insertInto(0, 10);
        list.insertInto(1, 11);
        list.insertInto(2, 0);
    }

    @Test
    void removeAt() {
        List list = new List(5);
        list.removeAt(1);

    }
}