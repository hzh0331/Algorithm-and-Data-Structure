package com.Zihao.sort;

public class RadixSortDemo {
    public static void radixSort(int[] list){
        int bucket[][] = new int[10][list.length];
        int bucketElementCount[] = new int[10];
        int max = 0;
        for (int i = 0; i < list.length; i++){
            max = Math.max(max, list[i]);
        }
        int digitalElement = 0;
        int maxLength = (max+"").length();
        for (int i = 0; i < maxLength; i++){
            for (int j = 0; j < list.length; j++){
                digitalElement = list[j] / (int)Math.pow(10,i) % 10;
                bucket[digitalElement][bucketElementCount[digitalElement]] = list[j];
                bucketElementCount[digitalElement]++;
            }
            int counter = 0;
            for (int j = 0; j < bucketElementCount.length; j++){
                if (bucketElementCount[j] != 0){
                    for (int k = 0; k < bucketElementCount[j]; k++){
                        list[counter] = bucket[j][k];
                        counter++;
                    }
                }
                bucketElementCount[j] = 0;
            }
        }
    }
}
