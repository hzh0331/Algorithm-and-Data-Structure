package com.Zihao.knapSack;

public class KnapSack {
    public int knapSack(int max, int[] weights, int[] values){
//        System.out.println(weights.length);
        int result[][] = new int[weights.length+1][max+1];
        for (int i = 1; i < weights.length+1; i++){
            for (int j = 1; j < max+1; j++){
                if (j < weights[i-1]) result[i][j] = result[i-1][j];
                else result[i][j] = Math.max(result[i-1][j], result[i-1][j-weights[i-1]] + values[i-1]);
            }
        }
        return result[weights.length][max];
    }
}
