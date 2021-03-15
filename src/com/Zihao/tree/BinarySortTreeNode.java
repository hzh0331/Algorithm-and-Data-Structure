package com.Zihao.tree;

public class BinarySortTreeNode<T> extends TreeNode {

    public BinarySortTreeNode(T value) {
        super(value);
    }

    public BinarySortTreeNode getLeft() {
        return (BinarySortTreeNode)this.left;
    }

    public void setLeft(BinarySortTreeNode left) {
       this.left = left;
    }

    public BinarySortTreeNode getRight() {
        return (BinarySortTreeNode)this.right;
    }

    public void setRight(BinarySortTreeNode right) {
        this.right = right;
    }

    public void add(T value){
        if ((Integer)this.getValue() < (Integer) value){
            if (this.getRight() == null)
                this.setRight(new BinarySortTreeNode<T>(value));
            else
                this.getRight().add(value);
        }else {
            if (this.getLeft() == null)
                this.setLeft(new BinarySortTreeNode<T>(value));
            else
                this.getLeft().add(value);
        }
    }

    public boolean delete(T value){
        if ((Integer) value < (Integer) this.getValue()){
            if (this.getLeft() == null) return false;
            if (this.getLeft().getValue() != value) return this.getLeft().delete(value);
            if (this.getLeft().getLeft() == null && this.getLeft().getRight() == null)
                this.setLeft(null);
            else if (this.getLeft().getLeft() == null && this.getLeft().getRight() != null)
                this.setLeft(this.getLeft().getRight());
            else if (this.getLeft().getLeft() != null && this.getLeft().getRight() == null)
                this.setLeft(this.getLeft().getLeft());
            else{
                BinarySortTreeNode temp = this.getLeft().getLeft();
                if (temp.getRight() != null){
                    while (temp.getRight().getRight()!=null){
                        temp = temp.getRight();
                    }
                    this.getLeft().setValue(temp.getRight().getValue());
                    temp.setRight(null);
                }else{
                    this.getLeft().setValue(temp.getValue());
                    this.getLeft().setLeft(null);
                }
            }
            return true;
        }else{
            if (this.getRight() == null) return false;
            if (this.getRight().getValue() != value) return this.getRight().delete(value);
            if (this.getRight().getLeft() == null && this.getRight().getRight() == null)
                this.setRight(null);
            else if (this.getRight().getLeft() == null && this.getRight().getRight() != null)
                this.setRight(this.getRight().getRight());
            else if (this.getRight().getLeft() != null && this.getRight().getRight() == null)
                this.setRight(this.getRight().getLeft());
            else{
                BinarySortTreeNode temp = this.getRight().getRight();
                if (temp.getLeft() != null) {
                    while (temp.getLeft().getLeft() != null) {
                        temp = temp.getLeft();
                    }
                    this.getRight().setValue(temp.getLeft().getValue());
                    temp.setLeft(null);
                }else{
                    this.getRight().setValue(temp.getValue());
                    this.getRight().setRight(null);
                }
            }
            return true;
        }
    }
}
