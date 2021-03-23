package com.Zihao.kmp;

public class KMP {
    public int kmp(String s1, String s2){
        int[] next = kmpNext(s2);
        for (int i = 0, j = 0; i < s1.length(); i++){
            while (j > 0 && s1.charAt(i) != s2.charAt(j)){
                j = next[j-1];
            }

            if (s1.charAt(i) != s2.charAt(j)) j++;
            if (j == s2.length()) return i-j+1;
        }
        return -1;
    }

    public int[] kmpNext(String dest){
        int[] result = new int[dest.length()];
        for (int i = 0, j = 0; i < result.length; i++){
            while (j > 0 && dest.charAt(i) != dest.charAt(j)){
                j = result[j-1];
            }

            if (dest.charAt(i) != dest.charAt(j)) j++;
            result[i] = j;
        }
        return  result;
    }
}
