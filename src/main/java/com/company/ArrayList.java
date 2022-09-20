package com.company;

import java.sql.Array;

public class ArrayList {


    private final Integer[] array;

// домашка 2.16

    public void grow(Integer[] array) {
        array =  new Integer[];
        int capacity = array.length;
        capacity *= 1.5;
        Integer[] newArray = new Integer[capacity];
        System.arraycopy(array, 0, newArray, 0, array.length);
        array = newArray;
    }

    public void add(Integer element) {
        if (!(array[array.length - 1] == null)) {
            int n = array.length - 1;
            grow(array);
            array[n] = element;
        } else {
            for (int i = 0; i < array.length; i++) {
                if (array[i] == null) {
                    array[i] = element;
                    break;
                }
            }
        }
    }


}
