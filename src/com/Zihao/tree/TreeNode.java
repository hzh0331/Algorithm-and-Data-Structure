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

    public TreeNode preOrderSearch(T value){
        if (this.value == value){
            return this;
        }

        TreeNode result = null;

        if (this.left != null){
            result = this.left.preOrderSearch(value);
        }

        if (result != null){
            return result;
        }

        if (this.right != null){
            result = this.right.preOrderSearch(value);
        }

        return result;
    }

    public TreeNode infixOrderSearch(T value){
        TreeNode result = null;

        if (this.left != null){
            result = this.left.infixOrderSearch(value);
        }

        if (result != null){
            return result;
        }

        if (this.value == value){
            return this;
        }

        if (this.right != null){
            result = this.right.infixOrderSearch(value);
        }

        return result;
    }

    public TreeNode postOrderSearch(T value){
        TreeNode result = null;

        if (this.left != null){
            result = this.left.postOrderSearch(value);
        }

        if (result != null){
            return result;
        }

        if (this.right != null){
            result = this.right.postOrderSearch(value);
        }

        if (result != null){
            return result;
        }
        if (this.value == value){
            return this;
        }

        return null;
    }

    public boolean remove(T value){
        if (this.left != null && this.left.getValue() == value){
            this.left = null;
            return true;
        }

        if (this.right != null && this.right.getValue() == value){
            this.right = null;
            return true;
        }

        if (this.left != null && this.left.remove(value)) return true;

        if (this.right != null && this.right.remove(value)) return true;

        return false;
    }
}
