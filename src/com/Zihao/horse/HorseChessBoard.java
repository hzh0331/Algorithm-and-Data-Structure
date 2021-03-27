package com.Zihao.horse;

import java.awt.*;
import java.util.ArrayList;

public class HorseChessBoard {
    private int X;
    private int Y;
    private int board[][];
    private boolean visited[];
    private boolean finished;

    public HorseChessBoard(int x, int y) {
        X = x;
        Y = y;
        board = new int[x][y];
        visited = new boolean[x * y];
        finished = false;
    }

    public int[][] getBoard() {
        return board;
    }

    public  ArrayList<Point> next(Point current){
        ArrayList<Point> result = new ArrayList<>();
        Point p = new Point();
        if ((p.x=current.x-2) >= 0 && (p.y=current.y-1) >= 0)
            result.add(new Point(p));
        if ((p.x=current.x+2) < X && (p.y=current.y+1) < Y)
            result.add(new Point(p));
        if ((p.x=current.x-2) >= 0 && (p.y=current.y+1) < Y)
            result.add(new Point(p));
        if ((p.x=current.x+2) < X && (p.y=current.y-1) >= 0)
            result.add(new Point(p));
        if ((p.x=current.x-1) >= 0 && (p.y=current.y-2) >= 0)
            result.add(new Point(p));
        if ((p.x=current.x-1) >= 0 && (p.y=current.y+2) < Y)
            result.add(new Point(p));
        if ((p.x=current.x+1) < X && (p.y=current.y-2) >= 0)
            result.add(new Point(p));
        if ((p.x=current.x+1) < X && (p.y=current.y+2) < Y)
            result.add(new Point(p));
        return result;
    }

    public void move(int board[][], int step, int x, int y){
//        show();
        Point current = new Point(x, y);
        ArrayList<Point> next = next(current);
        visited[x*X + y] = true;
        board[x][y] = step;
//        System.out.println(next.toArray().toString());
        while (!next.isEmpty()){
            Point p = next.remove(0);
//            System.out.println(p.toString());
//            System.out.println(p.y + " " + p.x);
            if (!visited[p.y * X + p.x]) move(board, step+1, p.y, p.x);
        }

        if(!finished && step < X * Y){
            board[x][y] = 0;
            visited[x*X + y] = false;
        }else{
            finished = true;
        }
    }

    public void show(){
        for (int[] row : board){
            for (int step : row){
                System.out.print(step + "\t");
            }
            System.out.println();
        }
        System.out.println();
    }
}
