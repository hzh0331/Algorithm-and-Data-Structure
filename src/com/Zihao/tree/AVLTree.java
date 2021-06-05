package com.Zihao.tree;

public class AVLTree<T extends Comparable<T>> extends BinarySortTree<T> {

    @Override
    public void add(Node<T> node, T value){
        super.add(node, value);
        node.setHeight(Math.max(height(node.getLeft()), height(node.getRight())) + 1);
        rotate(node);
    }

    @Override
    public void removeTwoLeavesNode(Node<T> node){
        node.setValue(removeTheMin(node.getRight()));
        remove(node, node.getRight(), node.getValue());
    }

    @Override
    public void nodeIsEqualToValue(Node<T> parent, Node<T> node){
        super.nodeIsEqualToValue(parent, node);
        rotate(node);
    }

    @Override
    public T removeTheMin(Node<T> node){
        if (node.getLeft() != null)
            node = node.getLeft();
        return node.getValue();
    }

    public void rotate(Node<T> node){
        if (height(node.getRight()) - height(node.getLeft()) > 1){
            if (height(node.getRight().getRight()) < height(node.getRight().getLeft()))
                node.setRight(rightRotate(node.getRight()));
            node.copy(leftRotate(node));
        }else if(height(node.getLeft()) - height(node.getRight()) > 1){
            if (height(node.getLeft().getLeft()) < height(node.getLeft().getRight()))
                node.setLeft(leftRotate(node.getLeft()));
            node.copy(rightRotate(node));
        }
    }

    public int height(Node<T> node){
        if (node == null) return 0;
        return node.getHeight();
    }


    public Node<T> leftRotate(Node<T> node){
        Node<T> newNode = new Node<>(node.getValue());
        newNode.setRight(node.getRight().getLeft());
        newNode.setHeight(Math.max(height(newNode.getRight()), height(newNode.getLeft())) + 1);

        node.setValue(node.getRight().getValue());
        node.setLeft(newNode);
        node.setRight(node.getRight().getRight());
        node.setHeight(Math.max(height(node.getRight()), height(node.getLeft())) + 1);
        return node;
    }

    public Node<T> rightRotate(Node<T> node){
        Node<T> newNode = new Node<>(node.getValue());
        newNode.setLeft(node.getLeft().getRight());
        newNode.setHeight(Math.max(height(newNode.getRight()), height(newNode.getLeft())) + 1);

        node.setValue(node.getLeft().getValue());
        node.setLeft(node.getLeft().getLeft());
        node.setRight(newNode);
        node.setHeight(Math.max(height(node.getRight()), height(node.getLeft())) + 1);
        return node;
    }
}
