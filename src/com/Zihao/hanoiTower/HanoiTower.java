package com.Zihao.hanoiTower;

public class HanoiTower {
    public static void main(String[] args){
        solver(5, 'A', 'B', 'C');
    }
    public static void solver(int num, char a, char b, char c){
        if (num == 1){
            System.out.println("move the no." + num + " from " + a  + " to " + c);
        }else{
            solver(num-1, a, c, b);
            System.out.println("move the no." + num + " from " + a  + " to " + c);
            solver(num-1, b, a, c);
        }
    }
}
