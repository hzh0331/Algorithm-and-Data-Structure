package com.Zihao.sort;

public class SelectionSortDemo {
    public static void selectionSort(int[] list){
        int minIndex;
        for (int i = 0; i < list.length-1; i++){
            minIndex = i;
            for (int j = i; j < list.length; j++){
                if (list[j] < list[minIndex]){
                    minIndex = j;
                }
            }
            if (i != minIndex){
                int temp = list[i];
                list[i] = list[minIndex];
                list[minIndex] = temp;
            }
        }
    }
}
