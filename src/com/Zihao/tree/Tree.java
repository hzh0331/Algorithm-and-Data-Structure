package com.Zihao.tree;

public abstract class Tree<T extends Comparable<T>> {
    protected Node<T> root;

    public Tree() {
    }

    public Tree(Node<T> root) {
        this.root = root;
    }

    public abstract void add(T value);

    public abstract boolean remove(T value);

    public Node<T> getRoot() {
        return root;
    }

    public void setRoot(Node<T> root) {
        this.root = root;
    }

    public void inOrderTraversal(){
        root.inOrderTraversal();
    }

    public void preOrderTraversal(){
        root.preOrderTraversal();;
    }

    public void postOrderTraversal(){
        root.postOrderTraversal();;
    }

    @Override
    public String toString() {
        return "Tree{" +
                "root=" + root +
                '}';
    }
}
