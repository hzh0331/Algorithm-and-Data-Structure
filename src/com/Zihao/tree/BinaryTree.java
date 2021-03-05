package com.Zihao.tree;

public class BinaryTree {
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
}
