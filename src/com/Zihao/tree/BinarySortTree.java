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
            return remove(root, value).getKey();
        }
        return false;
    }

    public Pair<Boolean, Node<T>> remove(Node<T> node, T value){
        if (node == null){
            return new Pair<Boolean, Node<T>>(false, null);
        }
        Pair<Boolean, Node<T>> result;
        if(node.getValue().compareTo(value) > 0){
            result = remove(node.getLeft(), value);
            node.setLeft(result.getValue());
            return new Pair<Boolean, Node<T>>(result.getKey(), node);
        }else if(node.getValue().compareTo(value) < 0){
            result = remove(node.getRight(), value);
            node.setRight(result.getValue());
            return new Pair<Boolean, Node<T>>(result.getKey(), node);
        }else{
            if (node.getLeft() == null)
                return new Pair<Boolean, Node<T>>(true, node.getRight());
            else if(node.getRight() == null){
                return new Pair<Boolean, Node<T>>(true, node.getLeft());
            }

            Node<T> temp = node.getRight();
            if(temp.getLeft() != null){
               while (temp.getLeft().getLeft() != null){
                   temp = temp.getLeft();
               }
               node.setValue(temp.getLeft().getValue());
               temp.setLeft(null);
            }else{
                node.setValue(temp.getValue());
                node.setRight(temp.getRight());
            }
            return new Pair<Boolean, Node<T>>(true, node);
        }
    }
}
