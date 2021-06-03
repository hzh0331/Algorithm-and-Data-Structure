package com.Zihao.tree;

public class Node<T> {
    private T value;
    private Node left;
    private Node right;

    public Node(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }

    public void inOrderTraversal(){
        if(left != null) left.inOrderTraversal();
        System.out.print(this.toString() + " ");
        if(right != null) right.inOrderTraversal();
    }

    public void preOrderTraversal(){
        System.out.print(this.toString() + " ");
        if(left != null) left.preOrderTraversal();
        if(right != null) right.preOrderTraversal();
    }

    public void postOrderTraversal(){
        if(left != null) left.postOrderTraversal();
        if(right != null) right.postOrderTraversal();
        System.out.print(this.toString() + " ");
    }

    @Override
    public String toString() {
//        return "Node{" +
//                "value=" + value +
//                ", left=" + left +
//                ", right=" + right +
//                '}';
        return value+"";
    }
}
