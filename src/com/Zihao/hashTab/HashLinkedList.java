package com.Zihao.hashTab;

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
            current = current.getNext();
        }
        System.out.println("the node does not exist");
        return false;
    }

    public HashNode find(int key){
        HashNode current = head.getNext();
        while (current!=null){
            if (current.getKey() == key){
                return current;
            }
            current = current.getNext();
        }
        System.out.println("the node does not exist");
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
            current = current.getNext();
        }
        System.out.println("the node does not exist");
        return false;
    }

    @Override
    public String toString() {
        return "HashLinkedList{" +
                "head=" + head +
                '}';
    }
}