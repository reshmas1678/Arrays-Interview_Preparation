package com.ArraysJava;

import java.util.Scanner;

public class _8_AverageOfArray {
    public static void main(String args[]) {
        int sum = 0;
        int a[] = new int[3];
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the values of the array");
        for (int i = 0; i < a.length; i++) {
            a[i] = s.nextInt();
        }
        for (int i = 0; i < a.length; i++) {
            sum = sum + a[i];
        }
        System.out.println(sum);
        System.out.println(sum/a.length);
    }
}
