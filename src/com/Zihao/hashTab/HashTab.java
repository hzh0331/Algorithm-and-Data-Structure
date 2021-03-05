package com.Zihao.hashTab;

import java.util.Arrays;

public class HashTab{
    private HashLinkedList[] hashLinkedLists;
    private int size;

    public HashTab(int size) {
        this.size = size;
        hashLinkedLists = new HashLinkedList[size];
        for (int i = 0; i < size; i++){
            hashLinkedLists[i] = new HashLinkedList();
        }
    }

    public int hashFunction(int key){
        return (key%size);
    }

    public void add(HashNode hashNode){
        hashLinkedLists[hashFunction(hashNode.getKey())].add(hashNode);
    }

    public boolean remove(int key){
        return hashLinkedLists[hashFunction(key)].remove(key);
    }

    public HashNode find(int key){
        return hashLinkedLists[hashFunction(key)].find(key);
    }

    public boolean modify(HashNode hashNode){
        return hashLinkedLists[hashFunction(hashNode.getKey())].modify(hashNode);
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public HashLinkedList[] getHashLinkedLists() {
        return hashLinkedLists;
    }

    public void setHashLinkedLists(HashLinkedList[] hashLinkedLists) {
        this.hashLinkedLists = hashLinkedLists;
    }

    @Override
    public String toString() {
        return "HashTab{" +
                "hashLinkedLists=" + Arrays.toString(hashLinkedLists) +
                ", size=" + size +
                '}';
    }
}




