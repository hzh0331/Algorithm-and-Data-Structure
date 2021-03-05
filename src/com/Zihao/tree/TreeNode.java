package com.Zihao.tree;

public class TreeNode<T> {
    private T value;
    private TreeNode left;
    private TreeNode right;

    public T getValue() {
        return value;
    }

    public TreeNode(T value) {
        this.value = value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public TreeNode getLeft() {
        return left;
    }

    public void setLeft(TreeNode left) {
        this.left = left;
    }

    public TreeNode getRight() {
        return right;
    }

    public void setRight(TreeNode right) {
        this.right = right;
    }

    @Override
    public String toString() {
        return "TreeNode{" +
                "value=" + value +
                '}';
    }

    public void preOrder(){
        System.out.print(this.toString()+ " ");
        if (this.left != null ){
            this.left.preOrder();
        }
        if (this.right != null){
            this.right.preOrder();
        }
    }

    public void infixOrder(){
        if (this.left != null ){
            this.left.infixOrder();
        }
        System.out.print(this.toString()+ " ");
        if (this.right != null){
            this.right.infixOrder();
        }
    }

    public void postOrder(){
        if (this.left != null ){
            this.left.postOrder();
        }
        if (this.right != null){
            this.right.postOrder();
        }
        System.out.print(this.toString()+ " ");
    }
}
