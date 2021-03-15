package com.Zihao.tree;

import java.util.*;

public class HuffmanCode {
    private static Map<Byte, String> huffManCodes = new HashMap<>();
    private static StringBuilder stringBuilder = new StringBuilder();
    private static List<HuffmanTreeNode> getNode(byte[] arr){
        List<HuffmanTreeNode> result = new ArrayList<>();
        Map<Byte, Integer> map = new HashMap<>();
        for (byte b: arr)
            map.put(b, map.getOrDefault(b, 0)+1);
        for (Map.Entry<Byte, Integer> entry: map.entrySet()){
            HuffmanTreeNode<Byte> huffmanTreeNode = new HuffmanTreeNode<>(entry.getKey(), entry.getValue());
            result.add(huffmanTreeNode);
        }
        return result;
    }

    private static Map<Byte, String> getCodes(HuffmanTreeNode huffmanTreeNode){
        getCodes((HuffmanTreeNode)huffmanTreeNode.getLeft(), "0", stringBuilder);
        getCodes((HuffmanTreeNode)huffmanTreeNode.getRight(), "1", stringBuilder);
        return huffManCodes;
    }

    private static HuffmanTreeNode createHuffmanTree(List<HuffmanTreeNode> list){
        Collections.sort(list);
        while(list.size()>1){
            HuffmanTreeNode left = list.get(0);
            HuffmanTreeNode right = list.get(1);
            HuffmanTreeNode<Integer> parent = new HuffmanTreeNode<>(0, left.getWeight() + right.getWeight());
            parent.setLeft(left);
            parent.setRight(right);
            list.remove(0);
            list.remove(0);
            list.add(parent);
            Collections.sort(list);
        }
        return list.get(0);
    }

    private static void getCodes(HuffmanTreeNode huffmanTreeNode, String code, StringBuilder stringBuilder){
        StringBuilder temp = new StringBuilder(stringBuilder);
        temp.append(code);
        if (huffmanTreeNode != null){
//            System.out.println(huffmanTreeNode.getValue());
            if (Integer.valueOf(huffmanTreeNode.getValue().toString()) == 0){
                getCodes((HuffmanTreeNode)huffmanTreeNode.getLeft(), "0", temp);
                getCodes((HuffmanTreeNode)huffmanTreeNode.getRight(), "1", temp);
            }else {
                huffManCodes.put((Byte) huffmanTreeNode.getValue(), temp.toString());
            }
        }
    }

    private static byte[] zip(byte[] bytes, Map<Byte, String> map){
        StringBuilder stringBuilder = new StringBuilder();
        for (byte b: bytes){
            stringBuilder.append(map.get(b));
        }
        int len = (stringBuilder.length()+7)/8;
        byte result[] = new byte[len];
        int index = 0;
        for (int i = 0; i < stringBuilder.length(); i+=8){
            if (i+8 > stringBuilder.length()){
                result[index] = (byte) Integer.parseInt(stringBuilder.substring(i));
            }else{
                result[index] = (byte) Integer.parseInt(stringBuilder.substring(i, i+8));
            }
            index++;
        }
        return result;
    }

    public static byte[] huffmanZip(byte[] bytes){
        List<HuffmanTreeNode> list = getNode(bytes);
        HuffmanTreeNode root = createHuffmanTree(list);
        Map<Byte, String> codes = getCodes(root);
        return zip(bytes, codes);
    }
}
