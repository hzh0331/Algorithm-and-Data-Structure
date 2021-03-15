package com.Zihao.tree;

public class BinarySortTree<T> extends BinaryTree<T> {
    private BinarySortTreeNode root;

    public void add(T value){
        if (root == null){
            root = new BinarySortTreeNode<T>(value);
        }else{
            root.add(value);
        }
    }

    @Override
    public void infixOrder() {
        if (root!=null){
            root.infixOrder();
        }
    }

    public boolean delete(T value){
        if (root != null){
            if (root.getValue() == value){
                if (root.getLeft() == null && root.getRight() == null)
                    root = null;
                else if (root.getLeft() != null && root.getRight() == null)
                    root = root.getLeft();
                else if (root.getLeft() == null && root.getRight() != null)
                    root = root.getRight();
                else{
                    BinarySortTreeNode temp = root.getLeft();
                    if (temp.getRight() != null){
                        while (temp.getRight().getRight()!=null){
                            temp = temp.getRight();
                        }
                        root.setValue(temp.getRight().getValue());
                        temp.setRight(null);
                    }else{
                        root.setValue(temp.getValue());
                        root.setLeft(null);
                    }
                }
                return true;
            }
            return root.delete(value);
        }
        return  false;
    }
}
