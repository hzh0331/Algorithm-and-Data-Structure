package com.Zihao.tree;

public class ArrTree {
    private int[] arr;
    private int size;

    public ArrTree(int size) {
        this.size = size;
        this.arr = new int[size];
    }

    public int[] getArr() {
        return arr;
    }

    public void setArr(int[] arr) {
        this.arr = arr;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void preOrder(int index){
        System.out.print(arr[index] + " ");

        if ((index * 2 + 1) < size){
            preOrder(index * 2 + 1);
        }

        if ((index * 2 + 2) < size){
            preOrder(index * 2 + 2);
        }
    }

    public void infixOrder(int index){
//        System.out.println(index);
        if ((index * 2 + 1) < size){
            infixOrder(index * 2 + 1);
//            System.out.println(arr[index]);
        }

//        System.out.println(arr[index]);
        System.out.print(arr[index] + " ");

        if ((index * 2 + 2) < size){
            infixOrder(index * 2 + 2);
        }
    }

    public void postOrder(int index){
        if ((index * 2 + 1) < size){
            postOrder(index * 2 + 1);
        }

        if ((index * 2 + 2) < size){
            postOrder(index * 2 + 2);
        }

        System.out.print(arr[index] + " ");
    }
}
