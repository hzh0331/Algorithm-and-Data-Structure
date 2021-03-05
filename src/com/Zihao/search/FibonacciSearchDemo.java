package com.Zihao.search;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FibonacciSearchDemo {
    public static int[] fib(){
        int fib[] = new int[20];
        fib[0] = 1;
        fib[1] = 1;
        for (int i = 2; i < 20; i++){
            fib[i] = fib[i-1] + fib[i - 2];
        }
        return fib;
    }

    public static List<Integer> fibonacciSearch(int list[], int target){
        int[] f = fib();
        List<Integer> result = new ArrayList<>();
        int low = 0;
        int k = 0;
        int mid = 0;
        int high = list.length-1;
        while (high > (f[k] - 1)){
            k++;
        }
        int temp[] = Arrays.copyOf(list, f[k]);

        for (int i = list.length; i < f[k]; i++){
            temp[i] = list[high];
        }

        while (low<=high){
            mid = low + f[k-1] -1;
            if (target < temp[mid]){
                high = mid -1;
                k--;
            }else if(target > temp[mid]){
                low = mid + 1;
                k -= 2;
            }else{
                mid = Math.min(mid, list.length-1);
                result.add(mid);
                int tem = mid - 1;
                while (tem >= 0 && list[tem] == target){
                    result.add(0, tem);
                    tem--;
                }

                tem = mid+1;
                while (tem < list.length && list[tem] == target){
                    result.add(tem);
                    tem++;
                }

                return result;
            }
        }
        result.add(-1);
        return result;
    }
}
