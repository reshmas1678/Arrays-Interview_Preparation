package com.ArraysJava;

import java.util.Arrays;
import java.util.Scanner;

public class _6_SortAnArray {
    public static void main(String args[]){
        int a[]= new int[10];
        System.out.println("Enter the values of the array");
        Scanner s = new Scanner(System.in);
        for(int i=0; i<a.length;i++){
            a[i] = s.nextInt();
        }
        for(int i=0; i <a.length;i++){
            for(int j=i; j<a.length;j++){
                if(a[i]> a[j]){
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(a));
    }
}
