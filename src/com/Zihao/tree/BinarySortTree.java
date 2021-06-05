package com.Zihao.tree;

import javafx.util.Pair;

import java.util.HashMap;
import java.util.Map;

public class BinarySortTree<T extends Comparable<T>> extends Tree<T> {
    public BinarySortTree() {
        super();
    }

    public BinarySortTree(Node<T> root) {
        super(root);
    }

    @Override
    public void add(T value) {
        if (root == null) root = new Node<T>(value);
        else add(root, value);
    }

    public void add(Node<T> node, T value){
        if(node.getValue().compareTo(value) < 0){
            if(node.getRight() == null) node.setRight(new Node<T>(value));
            else add(node.getRight(), value);
        }else {
            if (node.getLeft() == null) node.setLeft(new Node<T>(value));
            else add(node.getLeft(), value);
        }
    }

    @Override
    public boolean remove(T value) {
        if(root != null){
            return remove(null, root, value);
        }
        return false;
    }

    public boolean remove(Node<T> parent, Node<T> node, T value){
        if(node.getValue().compareTo(value) > 0){
            if (node.getLeft() == null) return false;
            else return remove(node, node.getLeft(), value);
        }else if(node.getValue().compareTo(value) < 0){
            if (node.getRight() == null) return false;
            else return remove(node, node.getRight(), value);
        }else{
            if (node.getLeft() != null && node.getRight() != null){
                Node<T> temp = node.getRight();
                if (temp.getLeft() != null)
                    node.setValue(removeTheMin(temp));
                else {
                    node.setValue(temp.getValue());
                    node.setRight(temp.getRight());
                }
            }else if(parent == null){
                if (root.getRight() != null) root = root.getRight();
                else if (root.getLeft() != null) root = root.getLeft();
                else root = null;
            } else if (parent.getRight() == node){
                parent.setRight(node.getLeft() == null ? node.getRight() : node.getLeft());
            }else{
                parent.setLeft(node.getLeft() == null ? node.getRight() : node.getLeft());
            }
            return true;
        }
    }

    public T removeTheMin(Node<T> node){
        T result;
        while (node.getLeft().getLeft() != null)
            node = node.getLeft();
        result = node.getLeft().getValue();
        node.setLeft(node.getLeft().getRight());
        return result;
    }
}
