package com.Zihao.tree;

public class AVLTreeNode<T> extends TreeNode<T> {

    public AVLTreeNode(T value) {
        super(value);
    }

    public int returnLeftHeight(){
        return left == null ? 0 :((AVLTreeNode) left).height();
    }

    public int returnRightHeight(){
        return right == null ? 0 :((AVLTreeNode) right).height();
    }

    public int height(){
        return Math.max(left == null ? 0: ((AVLTreeNode)left).height(), right == null ? 0 : ((AVLTreeNode)right).height()) + 1;
    }

    public void leftRotate(){
        AVLTreeNode avlTreeNode = new AVLTreeNode(getValue());
        avlTreeNode.setLeft(left);
        avlTreeNode.setRight(right.getLeft());
        setValue((T) right.getValue());
        right = right.getRight();
        left = avlTreeNode;
    }

    public void rightRotate(){
        AVLTreeNode avlTreeNode = new AVLTreeNode(getValue());
        avlTreeNode.setLeft(left.getRight());
        avlTreeNode.setRight(right);
        setValue((T) left.getValue());
        right = avlTreeNode;
        left = left.getLeft();
    }
}
