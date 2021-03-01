package com.Zihao.sort;

public class ShellSortDemo {
    public static void shellSort(int[] list){
        int gap = list.length/2;
        int temp = 0;
        while (gap > 0){
            for (int i = gap; i < list.length; i++){
                for (int j = i - gap; j >= 0; j-=gap){
                    if (list[j]>list[j+gap]){
                        temp = list[j];
                        list[j] = list[j+gap];
                        list[j+gap] = temp;
                    }
                }
            }
            gap = gap/2;
        }
    }

    public static void shellSort2(int[] list){
        int gap = list.length/2;
        int temp = 0;
        while (gap > 0){
            for (int i = gap; i < list.length; i++){
                int j = i;
                temp = list[j];
                while(j >= gap && temp < list[j - gap]){
                    list[j] = list[j-gap];
                    j = j - gap;
                }
                list[j] = temp;
            }
            gap = gap/2;
        }
    }
}
