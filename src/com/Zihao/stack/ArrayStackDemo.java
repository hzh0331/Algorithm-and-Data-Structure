package com.Zihao.stack;

import java.util.Arrays;

public class ArrayStackDemo {
    public static void main(String[] args){
        ArrayStack arrayStack = new ArrayStack(10);
        arrayStack.push(1);
        arrayStack.push(2);
        arrayStack.push(3);
        arrayStack.push(4);
        arrayStack.push(5);
        System.out.println(arrayStack.toString());
        System.out.println(arrayStack.pop());
        System.out.println(arrayStack.pop());
        System.out.println(arrayStack.pop());
        System.out.println(arrayStack.pop());
        System.out.println(arrayStack.pop());
    }
}

class ArrayStack{
    private int maxSize;
    private int[] stack;
    private int top;

    public ArrayStack(int maxSize) {
        this.maxSize = maxSize;
        this.stack = new int[maxSize];
        this.top = -1;
    }

    public boolean isFull(){
        return (top == maxSize-1);
    }

    public boolean isEmpty(){
        return (top == -1);
    }

    public boolean push(int element){
        if (isFull()) {
            System.out.println("the stack is full");
            return false;
        }
        top++;
        stack[top] = element;
        return true;
    }

    public int pop(){
        if (isEmpty()){
            throw new RuntimeException("the stack is empty");
        }
        int temp = stack[top];
//        stack[top] = 0;
        top--;
        return temp;
    }


    public int getMaxSize() {
        return maxSize;
    }

    public void setMaxSize(int maxSize) {
        this.maxSize = maxSize;
    }

    public int[] getStack() {
        return stack;
    }

    public void setStack(int[] stack) {
        this.stack = stack;
    }

    public int getTop() {
        return top;
    }

    public void setTop(int top) {
        this.top = top;
    }

    @Override
    public String toString() {
        return "ArrayStack{" +
                "maxSize=" + maxSize +
                ", stack=" + Arrays.toString(stack) +
                ", top=" + top +
                '}';
    }
}