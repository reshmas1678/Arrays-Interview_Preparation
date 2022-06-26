package com.ArraysJava;

import java.util.Scanner;

public class _4_LengthOfArray {
    public static void main(String args[]){
        int n;
        int a[] = new int[10];
        Scanner s = new Scanner(System.in);
        System.out.println("Enter number of the values in array  :");

        n = s.nextInt();
        for(int i=0; i <n; i++) {
            a[i] = s.nextInt();
        }
        System.out.println("Length of the array is :");
        System.out.println(a.length);
    }
}

//Since the array size is predefined even after if we enter the "n" number of values in array, it would only consider the predefined length