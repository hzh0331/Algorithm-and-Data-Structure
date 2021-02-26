package com.Zihao.stack;

public class LinkedListStackDemo {
    public static void main(String[] args){
        LinkedListStack linkedListStack = new LinkedListStack();
        linkedListStack.push(1);
        linkedListStack.push(2);
        linkedListStack.push(3);
        linkedListStack.push(4);
        linkedListStack.push(5);
        System.out.println(linkedListStack.toString());
        System.out.println(linkedListStack.pop());
        System.out.println(linkedListStack.pop());
        System.out.println(linkedListStack.pop());
        System.out.println(linkedListStack.pop());
        System.out.println(linkedListStack.pop());
    }
}

class LinkedListStack{
    private Node head = new Node(0);

    public boolean isEmpty(){
        return (head.getNext() == null);
    }

    public void push(int value){
        Node node = new Node(value);
        Node next = head.getNext();
        head.setNext(node);
        node.setNext(next);
    }

    public int pop(){
        if (isEmpty()) throw new RuntimeException("the stack is empty");
        int value = head.getNext().getValue();
        head.setNext(head.getNext().getNext());
        return value;
    }

    @Override
    public String toString() {
        return "LinkedListStack{" +
                "head=" + head +
                '}';
    }
}

class Node{
    private int value;
    private Node next;

    public Node(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "Node{" +
                "value=" + value +
                ", next=" + next +
                '}';
    }
}
