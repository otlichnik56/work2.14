package test;

import com.company.StringList;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestString {

    private List<Integer> list1;
    private List<Integer> list2;
    private List<Integer> list3;

    @BeforeEach
    public void initOut() {
        Integer[] array = new Integer[100000];
        for (int i = 0; i < array.length; i++) {
            array[i] = ((int)(Math.random() * 100000));
        }

        list1 = new ArrayList<>();
        list2 = new ArrayList<>();
        list3 = new ArrayList<>();

        list1 = Arrays.asList(array);
        list2 = Arrays.asList(array);
        list3 = Arrays.asList(array);
    }

    @Test
    public void testSortBubble() {
        long start = System.currentTimeMillis();
        StringList.sortBubble(list1);
        System.out.println(System.currentTimeMillis() - start);
    }

    @Test
    public void testSortSelection() {
        long start = System.currentTimeMillis();
        StringList.sortSelection(list2);
        System.out.println(System.currentTimeMillis() - start);
    }

    @Test
    public void testSortInsertion() {
        long start = System.currentTimeMillis();
        StringList.sortInsertion(list3);
        System.out.println(System.currentTimeMillis() - start);
    }

}
