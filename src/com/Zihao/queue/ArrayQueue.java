package com.Zihao.queue;

public class ArrayQueue {
    private int front;
    private int rare;
    private int maxSize;
    private int[] arr;

    public ArrayQueue(int maxSize) {
        this.front = 0;
        this.rare = 0;
        this.maxSize = maxSize;
        this.arr = new int[maxSize];
    }

    public void addQueue(int element){
        if (isFull()){
            System.out.println("Queue is full");
            return;
        }
        arr[rare] = element;
        rare = (rare + 1)%maxSize;
    }

    public int removeQueue(){
        if (isEmpty()){
            throw new RuntimeException("Queue is empty");
        }
        int temp = arr[front];
        front = (front + 1) % maxSize;
        return temp;
    }

    public boolean isEmpty(){
        return (front == rare);
    }

    public boolean isFull(){
        return (((rare+1)%maxSize) == front);
    }

    public void printQueue(){
        if(isEmpty()) System.out.println("the queue is empty");
        else{
            for (int i = 0; i < maxSize; i++){
                System.out.println(i+" "+arr[i]);
            }
        }
    }

    public void getFirst(){
        if(isEmpty()) System.out.println("the queue is empty");
        else{
            System.out.println(arr[front+1]);
        }
    }

    public static void main(String args[]){

    }
}
