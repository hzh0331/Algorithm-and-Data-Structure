package com.Zihao.tree;

public class BinaryTree<T extends Comparable<T>> extends Tree<T> {

    public BinaryTree() {
        super();
    }

    public BinaryTree(Node<T> root) {
        super(root);
    }

    @Override
    public boolean remove(T value) {
        if (root.getValue() == value) return true;
        else return remove(root, value);
    }

    public boolean remove(Node<T> node, T value){
        if(node.getLeft() != null && node.getLeft().getValue() == value){
            node.setLeft(null);
            return true;
        }

        if(node.getRight() != null && node.getRight().getValue() == value){
            node.setRight(null);
            return true;
        }

        if(node.getLeft() != null && remove(node.getLeft(), value)) return true;

        return node.getRight() != null && remove(node.getRight(), value);
    }

    @Override
    public void add(T value) {

    }
}
