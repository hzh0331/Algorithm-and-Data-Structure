package com.Zihao.recursion;

/**
 * 1 for boundary 2 for path 3 for failed path 4 for target
 */
public class Maze {
    public static void main(String[] args){
        int[][] map = new int[8][7];
        for (int i = 0; i < 7; i++){
            map[0][i] = 1;
            map[7][i] = 1;
        }

        for (int i = 0; i < 8; i++){
            map[i][0] = 1;
            map[i][6] = 1;
        }

        map[3][1] = 1;
        map[3][2] = 1;

        map[6][5] = 4;
        seeWay(map, 1, 1);

        print(map);

    }

    public static void print(int[][] map){
        for (int i = 0; i < 8; i++){
            for (int j = 0; j <7; j++){
                System.out.print(map[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static boolean seeWay(int[][] map, int i, int j){
//        print(map);
        if (map[i][j] == 4){
            return true;
        }else{
            if (map[i][j] == 0){
                map[i][j] = 2;
                //down
                if (seeWay(map, i+1, j)){
                    return true;
                }

                //right
                if (seeWay(map, i, j+1)){
                    return true;
                }

                //up
                if (seeWay(map, i-1, j)){
                    return true;
                }

                //left
                if (seeWay(map, i, j-1)){
                    return true;
                }
                map[i][j] = 3;
            }
            return false;
        }
    }
}
