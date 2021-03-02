package com.Zihao.sort;

public class MergeSortDemo {

    public static void mergeSort(int[] list, int left, int right){
        if (left<right){
            int mid = (left+right)/2;
            mergeSort(list, left, mid);
            mergeSort(list, mid+1, right);
            merge(list, left, mid, right);
        }
    }

    public static void print(int[] list, int left, int right){
        for (int i = left; i <= right; i++){
            System.out.print(list[i] + " ");
        }
        System.out.println();
    }

    public static void merge(int[] list, int left, int mid, int right){
        int temp[] = new int[right-left+1];
        int l = left;
        int r = mid + 1;
        int counter = 0;
        while (l <= mid && r <= right){
            if (list[l]<list[r]){
                temp[counter] = list[l];
                l++;
            }else {
                temp[counter] = list[r];
                r++;
            }
            counter++;
        }

        while (l<=mid){
            temp[counter] = list[l];
            l++;
            counter++;
        }

        while (r<=right){
            temp[counter] = list[r];
            r++;
            counter++;
        }

        for (int i = 0; i < temp.length; i++){
            list[i+left] = temp[i];
        }
    }
}
