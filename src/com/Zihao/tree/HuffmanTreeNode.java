package com.Zihao.tree;

public class HuffmanTreeNode<T> extends TreeNode<T> implements Comparable<HuffmanTreeNode> {
    public HuffmanTreeNode(T value) {
        super(value);
    }

    public void setLeft(HuffmanTreeNode left) {
        this.left = left;
    }

    public void setRight(HuffmanTreeNode right) {
        this.right = right;
    }

    @Override
    public int compareTo(HuffmanTreeNode o) {
        return (Integer) this.getValue() - (Integer)o.getValue();
    }

    @Override
    public String toString() {
        return ""+getValue();
    }
}
