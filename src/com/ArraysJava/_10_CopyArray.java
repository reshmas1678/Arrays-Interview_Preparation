package com.ArraysJava;

import java.util.Arrays;

public class _10_CopyArray {
    public static void main(String args[]){
        int a[] = {8,2,3,3,4,5,5,5};
        int temp[] = new int[8];
        for(int i = 0; i<a.length;i++){
           temp[i] = a[i];
        }
        System.out.println(Arrays.toString(temp));
    }
}
