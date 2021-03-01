package com.Zihao.sort;

public class QuickSortDemo {
    public static void quickSort(int[] list, int left, int right){
        int l = left;
        int r = right;
        int pivot = list[(right+left)/2];
        int temp = 0;
        while (l<r){
            while (list[l]<pivot){
                l++;
            }
            while (list[r]>pivot){
                r--;
            }
            if (l >= r){
                break;
            }
            temp = list[l];
            list[l] = list[r];
            list[r] = temp;

            if (list[l] == pivot){
                r--;
            }

            if (list[r] == pivot){
                l++;
            }
        }

        if (l == r){
            l++;
            r--;
        }
        if (left<r){
            quickSort(list, left, r);
        }
        if (right>l){
            quickSort(list, l, right);
        }
    }
}
