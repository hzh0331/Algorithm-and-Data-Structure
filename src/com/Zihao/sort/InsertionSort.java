package com.Zihao.sort;

public class InsertionSort {
    public static void InsertionSort(int[] list){
        for (int i = 1; i < list.length; i++){
            int insertValue = list[i];
            int insertIndex = i-1;

            while (insertIndex >= 0 && insertValue < list[insertIndex]){
                list[insertIndex+1] = list[insertIndex];
                insertIndex--;
            }

            list[insertIndex+1] = insertValue;
        }
    }
}
