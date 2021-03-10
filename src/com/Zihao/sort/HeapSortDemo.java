package com.Zihao.sort;

public class HeapSortDemo {
    public static void heapSort(int arr[]){
        for (int i = arr.length/2 - 1; i >=0 ; i--)
            adjust(arr, i, arr.length);
        for (int i = arr.length-1; i > 0; i--){
            int temp = arr[i];
            arr[i] = arr[0];
            arr[0] = temp;
            adjust(arr, 0, i);
        }
    }

    public static void adjust(int arr[], int i, int length){
        int temp = arr[i];
        for (int k = i * 2 + 1; k < length; k = k * 2 + 1){
            if (k+1<length && arr[k] < arr[k+1]) k++;
            if (temp < arr[k]) {
                arr[i] = arr[k];
                i = k;
            }
            else break;
        }
        arr[i] = temp;
    }
}
