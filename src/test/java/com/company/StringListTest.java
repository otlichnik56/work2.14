package com.company;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class StringListTest {

    private List<Integer> expected;
    private List<Integer> target;

    @BeforeEach
    public void setUp() {
        expected = List.of(1, 2, 3, 4, 5);
        target = List.of(5, 2, 1, 4, 3);
    }

    @Test
    void sortBubble() {
        List<Integer> actual = new ArrayList<>(target);
        StringList.sortBubble(actual);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void sortSelection() {
        List<Integer> actual = new ArrayList<>(target);
        StringList.sortSelection(actual);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void sortInsertion() {
        List<Integer> actual = new ArrayList<>(target);
        StringList.sortInsertion(actual);
        Assertions.assertEquals(expected, actual);
    }

}