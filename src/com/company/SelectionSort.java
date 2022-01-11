package com.company;

import java.util.Arrays;

public class SelectionSort {
//https://www.geeksforgeeks.org/selection-sort/
     void sort(int a[]) {

        int n = a.length;

        for (int i = 0; i < n - 1; i++) {
            int min_index = i;
            for (int j = i + 1; j < n; j++) {
                if (a[j] < a[min_index]) {
                    min_index = j;
                }
            }
            int temp = a[min_index];
            a[min_index] = a[i];
            a[i] = temp;
        }
    }

     void print(int a[]){

        Arrays.stream(a).forEach(System.out::println);

    }

    public static void main(String[] args){
        int a[] = {3,1,6,-1,5};
        SelectionSort ob = new SelectionSort();
        ob.sort(a);
        ob.print(a);

    }
}
