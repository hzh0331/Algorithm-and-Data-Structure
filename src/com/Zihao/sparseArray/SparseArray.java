package com.Zihao.sparseArray;

public class SparseArray {
    public static void main(String[] args) {
        int chessArr[][] = new int[11][11];
        chessArr[1][2] = 1;
        chessArr[2][3] = 2;
        int sum = 0;
        for (int i = 0; i < 11; i++) {
            for (int j = 0; j < 11; j++) {
                if (chessArr[i][j] != 0) sum++;
            }
        }
        int sparseArray[][] = new int[sum+1][3];
        sparseArray[0][0] = 11;
        sparseArray[0][1] = 11;
        sparseArray[0][2] = sum;
        int counter = 1;
        for (int i = 0; i < 11; i++) {
            for (int j = 0; j < 11; j++) {
                if (chessArr[i][j] != 0) {
                    sparseArray[counter][0] = i;
                    sparseArray[counter][1] = j;
                    sparseArray[counter][2] = chessArr[i][j];
                    counter++;
                }
            }
        }
//        for (int i = 0; i < 3; i++){
//            for (int j = 0; j < sum+1; j++){
//                System.out.print(sparseArray[i][j]+" ");
//            }
//            System.out.println();
//        }
        int output[][] = new int[sparseArray[0][0]][sparseArray[0][1]];
        for (int i = 1; i < sum+1; i++){
            output[sparseArray[i][0]][sparseArray[i][1]] = sparseArray[i][2];
        }
        for (int i = 0; i < 11; i++){
            for (int j = 0; j < 11; j++){
                System.out.print(output[i][j]+" ");
            }
            System.out.println();
        }
    }
}
