package com.Zihao.sort;

/**
 * time complexity: O(n^2)
 */
public class BubbleSortDemo {
    public static void main(String[] args){

    }

    public static void bubbleSort(int[] list){
        //optimization: if after one iteration, the flag is not set to true, that means no swap, so break;
        boolean flag = false;
        for (int i = 0; i < list.length-1; i++){
            flag = false;
            for (int j = 0; j < list.length-1-i; j++){
                if (list[j]>list[j+1]){
                    flag = true;
                    int temp = list[j];
                    list[j] = list[j+1];
                    list[j+1] = temp;
                }
            }
            if (!flag){
                break;
            }
        }
    }
}
