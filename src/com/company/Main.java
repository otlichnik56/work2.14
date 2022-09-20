package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Integer[] array = new Integer[100000];
        for (int i = 0; i < array.length; i++) {
            array[i] = ((int)(Math.random() * 100000));
        }

        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        List<Integer> list3 = new ArrayList<>();
        list1 = Arrays.asList(array);
        list2 = Arrays.asList(array);
        list3 = Arrays.asList(array);

        long start = System.currentTimeMillis();
        StringList.sortInsertion(list3);
        System.out.println(System.currentTimeMillis() - start);
        System.out.println(list3.toString());

    }

}
