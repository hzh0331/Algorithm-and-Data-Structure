package com.Zihao.search;

import java.util.ArrayList;
import java.util.List;

public class InsertValueSearch {
    public static List<Integer> insertValueSearch(int[] list, int left, int right, int target){
        if (left > right){
            List<Integer> result = new ArrayList<>();
            result.add(-1);
            return result;
        }

        int mid = left + (right - left) * ((target - list[left]) / (list[right] - list[left]));

        if (list[mid] > target){
            return insertValueSearch(list, left, mid - 1, target);
        }else if (list[mid] < target){
            return insertValueSearch(list, mid + 1 , right, target);
        } else{
            List<Integer> result = new ArrayList<>();
            result.add(mid);
            int temp = mid - 1;
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
