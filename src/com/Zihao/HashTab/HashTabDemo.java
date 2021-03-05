package com.Zihao.HashTab;

public class HashTabDemo {
}

class HashTab{
    private HashLinkedList[] hashLinkedLists;

}

class HashLinkedList{
    private HashNode<String> head = new HashNode<>(0, null);

    public HashNode<String> getHead() {
        return head;
    }

    public void setHead(HashNode<String> head) {
        this.head = head;
    }

    public void add(HashNode hashNode){
        HashNode current = head;
        while (current.getNext()!=null) current = current.getNext();
        current.setNext(hashNode);
    }

    public boolean remove(int key){
        HashNode current = head;
        while (current.getNext()!=null){
            if (current.getNext().getKey() == key){
                HashNode next = current.getNext().getNext();
                current.setNext(next);
                return true;
            }
        }
        return false;
    }

    public HashNode find(int key){
        HashNode current = head.getNext();
        while (current!=null){
            if (current.getKey() == key){
                return current;
            }
        }
        return null;
    }

    public boolean modify(HashNode hashNode){
        HashNode current = head;
        while (current.getNext() != null){
            if (current.getNext().getKey() == hashNode.getKey()){
                HashNode next = current.getNext().getNext();
                hashNode.setNext(next);
                current.setNext(hashNode);
                return true;
            }
        }
        return false;
    }
}

class HashNode<T>{
    private int key;
    private T value;
    private HashNode next;

    public HashNode(int key, T value) {
        this.key = key;
        this.value = value;
    }

    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public HashNode getNext() {
        return next;
    }

    public void setNext(HashNode next) {
        this.next = next;
    }
}
