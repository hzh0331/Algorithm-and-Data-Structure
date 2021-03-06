package com.Zihao.tree;

public class BinaryTree<T> {
    private TreeNode root;

    public TreeNode getRoot() {
        return root;
    }

    public void setRoot(TreeNode root) {
        this.root = root;
    }

    public void preOrder(){
        if (root != null){
            root.preOrder();
        }
    }

    public void infixOrder(){
        if (root != null){
            root.infixOrder();
        }
    }

    public void postOrder(){
        if (root != null){
            root.postOrder();
        }
    }

    public TreeNode preOrderSearch(T value){
        if (root != null){
            return root.preOrderSearch(value);
        }
        return null;
    }

    public TreeNode infixOrderSearch(T value){
        if (root != null){
            return root.infixOrderSearch(value);
        }
        return null;
    }

    public TreeNode postOrderSearch(T value){
        if (root != null){
            return root.postOrderSearch(value);
        }
        return null;
    }
}
