package com.Zihao.recursion;

public class EightQueens {
    static int max = 8;
    static int[] result = new int[max];
    static int counter = 0;
    public static void main(String[] args){
        check(0);
        System.out.println("there are " + counter + " solutions");
    }

    private static void print(){
        counter++;
        for (int i = 0; i < result.length; i++){
            System.out.print(result[i] + " ");
        }
        System.out.println();
    }

    private static void check(int n){
        if (n == max){
            print();
            return;
        }

        for (int i = 0; i < max; i++){
            result[n] = i;
            if (!hasConflict(n)){
                check(n+1);
            }
        }
    }

    private static boolean hasConflict(int n){
        for (int i = 0; i < n; i++){
            if ((result[i] == result[n]) || (Math.abs(n - i ) == Math.abs(result[i]- result[n]))){
                return true;
            }
        }
        return false;
    }
}
