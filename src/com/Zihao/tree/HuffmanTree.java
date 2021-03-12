package com.Zihao.tree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class HuffmanTree {
    public static void createHuffmanTree(int[] arr){
        List<HuffmanTreeNode> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++){
            HuffmanTreeNode<Integer> huffmanTreeNode = new HuffmanTreeNode<>(arr[i]);
            list.add(huffmanTreeNode);
        }
        Collections.sort(list);
        while(list.size()>1){
            HuffmanTreeNode left = list.get(0);
            HuffmanTreeNode right = list.get(1);
            HuffmanTreeNode<Integer> parent = new HuffmanTreeNode<>((Integer)left.getValue()+(Integer)right.getValue());
            parent.setLeft(left);
            parent.setRight(right);
            list.remove(0);
            list.remove(0);
            list.add(parent);
            Collections.sort(list);
        }
        list.get(0).preOrder();
    }
}
