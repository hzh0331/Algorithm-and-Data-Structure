package com.Zihao.tree;

public class HuffmanTreeNode<T> extends TreeNode<T> implements Comparable<HuffmanTreeNode> {
    private int weight;

    public HuffmanTreeNode(T value) {
        super(value);
        this.weight = (Integer) value;
    }

    public HuffmanTreeNode(T value, int weight) {
        super(value);
        this.weight = weight;
    }

    public void setLeft(HuffmanTreeNode left) {
        this.left = left;
    }

    public void setRight(HuffmanTreeNode right) {
        this.right = right;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public int compareTo(HuffmanTreeNode o) {
        return this.weight - o.getWeight();
    }

    @Override
    public String toString() {
        return ""+getWeight();
    }
}
