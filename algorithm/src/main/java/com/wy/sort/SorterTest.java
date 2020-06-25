package com.wy.sort;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author matthew_wu
 * @since 2020-06-24 11:23
 */
public class SorterTest {
    public static void main(String[] args) {
        Sorter sorter = new InsertionSort();
        Integer[] list = new Integer[]{11, 1, 4, 7, 2, 3, 9, 8, 0, 5};
        System.out.println(Arrays.toString(list));
        // 为什么Comparator.naturalOrder().reversed()会有范型错误
        sorter.sort(list, Comparator.comparing((Integer i) -> i).reversed());
        System.out.println(Arrays.toString(list));
    }
}
