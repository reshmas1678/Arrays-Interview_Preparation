package com.ArraysJava;

import java.util.Arrays;

public class _9_SumOfTwoArrayElements {
    public static void main(String args[]) {
        int array1[] = {1, 2, 3, 4, 5};
        int array2[] = {2, 3, 4, 5, 6};
        int array3[] = new int[5];
        if (array1.length == array2.length) {
            for (int i = 0; i < array1.length; i++) {
                for (int j = 0; j < array2.length; j++) {
                    array3[i] = array1[i] + array2[i];
                }
            }
        }
        System.out.println(Arrays.toString(array3));
    }
}
