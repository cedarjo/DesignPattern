package com.cedar.designpattern.strategy.comparator;

import java.util.Arrays;
import java.util.Comparator;

public class Client {

    public static void main(String[] args) {
        Integer[] data = new Integer[] { 7, 3, 9, 3, 6, 4, 9, 1 };
        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if (o1 > o2) {
                    return 1;
                } else if (o1 < o2) {
                    return -1;
                } else {
                    return 0;
                }
            }
        };
        Arrays.sort(data, comparator);
        /**
         * public static <T> void sort(T[] a, Comparator<? super T> c) {
         * if (c == null) {
         * sort(a); // 默认方法
         * } else {
         * if (LegacyMergeSort.userRequested)
         * legacyMergeSort(a, c); // 使用策略对象
         * else
         * TimSort.sort(a, 0, a.length, c, null, 0, 0);
         * }
         * }
         */
        System.out.println(Arrays.toString(data));
    }

}
