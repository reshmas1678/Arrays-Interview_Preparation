package com.ArraysJava;

import java.util.Scanner;

public class _1_NumberOfPairsInArrayIsEqualToSum {

    public static void main(String[] args) {
        // write your code here
        int n;
        int sum = 4;
        int[] a = new int[6];
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number of values in array");
        n = s.nextInt();

        System.out.println("Please enter the values of the array");
        for (int i = 0; i < n; i++) {
            a[i] = s.nextInt();
        }

        System.out.println("The elements of teh array are");
        for (int i = 0; i < n; i++) {
            System.out.println(a[i]);
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                if (a[i] + a[j] == sum) {
                    System.out.println("The values of i and j are equal to sum");
                    System.out.println(a[i]);
                    System.out.println(a[j]);
                    break;
                }
            }
        }
    }
}
