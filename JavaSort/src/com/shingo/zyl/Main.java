package com.shingo.zyl;

public class Main {

    public static void main(String[] args) {

        int []a = {4,56,23,78,24,45,11};
        sort(a);
    }

    public static void sort(int[] arr) {
        int index;
        for (int i = 1;i < arr.length;++i) {
            index = 0;
            for (int j = 1;j <= arr.length-i;++j) {
                if (arr[j] < arr[index]) {
                    index = j;
                }
            }
            if (index != arr.length-i) {
                int temp = arr[arr.length-i];
                arr[arr.length-i] = arr[index];
                arr[index] = temp;
            }
        }
        for (int i = 0;i<arr.length;++i) {
            System.out.println(arr[i]);
        }
    }
}
