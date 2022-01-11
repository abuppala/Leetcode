package com.company;

import java.util.Arrays;

public class InsertionSort {

    void sort(int a[]){
        int n = a.length;
        int temp = 0, j=0;
        for(int i=1; i<n; i++) {
            temp = a[i];
            j=i-1;
            while(j>=0 && a[j] > temp){
                a[j+1] = a[j];
                j--;
            }
            a[j+1]= temp;
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
