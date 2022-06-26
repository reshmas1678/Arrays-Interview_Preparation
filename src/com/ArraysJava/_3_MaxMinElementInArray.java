package com.ArraysJava;

import java.util.Scanner;

public class _3_MaxMinElementInArray {
    public int minvalue(int[] a) {
        int min = a[0];
        if (a.length == 1) {
            min = a[0];
        } else {
            for (int i = 0; i < a.length; i++) {
                if (a[i] < min) {
                    min = a[i];
                }
            }
        }

        return min;
    }

    private int maxvalue(int[] a) {
        int max = 0;
        if (a.length == 1) {
            max = a[0];
        } else {
            for (int i = 0; i < a.length; i++) {
                if (a[i] > max) {
                    max = a[i];
                }
            }
        }
        return max;
    }

    public static void main(String args[]) {
        int n;
        int a[] = new int[3];
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number of values in an array n : ");
        n = s.nextInt();
        System.out.println("Enter the values of array");

        for (int i = 0; i < n; i++) {
            a[i] = s.nextInt();
        }

        _3_MaxMinElementInArray m = new _3_MaxMinElementInArray();
        System.out.println("Print the minimum value: ");
        System.out.println(m.minvalue(a));
        System.out.println("Print the maximum value: ");
        System.out.println(m.maxvalue(a));
    }


}
