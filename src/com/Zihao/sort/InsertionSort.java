package com.Zihao.sort;

public class InsertionSort {
    public static void InsertionSort(int[] list){
        int insertValue = 0;
        int insertIndex = 0;
        for (int i = 1; i < list.length; i++){
            insertValue = list[i];
            insertIndex = i-1;

            while (insertIndex >= 0 && insertValue < list[insertIndex]){
                list[insertIndex+1] = list[insertIndex];
                insertIndex--;
            }

            list[insertIndex+1] = insertValue;
        }
    }
}
