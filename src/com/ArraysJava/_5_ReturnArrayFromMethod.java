package com.ArraysJava;

public class _5_ReturnArrayFromMethod {
    public static void main(String args[]) {
        int arrayvalues[] = arraymethod();
        for (int i = 0; i < arrayvalues.length; i++) {
            System.out.println(arrayvalues[i]);
        }
    }

    private static int[] arraymethod() {
        int a[] = {1, 2, 3};
        return a;
    }
}
