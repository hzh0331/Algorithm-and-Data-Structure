package com.Zihao.search;

import java.util.ArrayList;
import java.util.List;

public class BinarySearchDemo {
    public static int binarySearch(int[] list, int left, int right, int target){
        if (left > right){
            return -1;
        }
        int mid = (right+left)/2;
        if (target > list[mid]){
            return binarySearch(list, mid+1, right, target);
        }else if (target < list[mid]){
            return binarySearch(list, left, mid-1, target);
        }else{
            return mid;
        }
    }

    public static List<Integer> binarySearchWithMultipleResults(int[] list, int left, int right, int target){
        List<Integer> result = new ArrayList<>();
        if (left > right){
            result.add(-1);
            return result;
        }
        int mid = (right+left)/2;
        if (target > list[mid]){
            return binarySearchWithMultipleResults(list, mid+1, right, target);
        }else if (target < list[mid]){
            return binarySearchWithMultipleResults(list, left, mid-1, target);
        }else{
            result.add(mid);
            int temp = mid-1;
            while (temp >= 0 && list[temp] == target){
                result.add(0, temp);
                temp--;
            }
            temp = mid+1;
            while (temp < list.length && list[temp] == target){
                result.add(temp);
                temp++;
            }
            return result;
        }
    }
}
