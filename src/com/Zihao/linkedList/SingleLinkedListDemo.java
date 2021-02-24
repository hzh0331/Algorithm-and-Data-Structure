package com.Zihao.linkedList;

import java.util.Stack;

public class SingleLinkedListDemo {
    public static void main(String[] args){
        HeroNode heroNode1 = new HeroNode(1, "宋江", "及时雨");
        HeroNode heroNode2 = new HeroNode(2, "卢俊义", "玉麒麟");
        HeroNode heroNode3 = new HeroNode(3, "吴用", "智多星");
        HeroNode heroNode4 = new HeroNode(4, "林冲", "豹子头");
        HeroNode heroNode5 = new HeroNode(2, "test", "test");

        SingleLinkedList heros = new SingleLinkedList();
        heros.addInOrder(heroNode1);
        heros.addInOrder(heroNode4);
        heros.addInOrder(heroNode2);
        heros.addInOrder(heroNode3);
//        heros.addInOrder(heroNode4);

//        heros.update(heroNode5);
//        heros.remove(3);

//        heros.print();
        reversePrint(heros.getHead());
    }

    public static void reverse(HeroNode head){
        HeroNode current = head.getNext();
        HeroNode next = new HeroNode(0,"","");
        HeroNode reverseHead = new HeroNode(0,"","");
        while (current != null){
            next = current.getNext();
            current.setNext(reverseHead.getNext());
            reverseHead.setNext(current);
            current = next;
        }
        head.setNext(reverseHead.getNext());
        System.out.println(reverseHead);
    }

    public static void reversePrint(HeroNode head){
        HeroNode temp = head;
        Stack<HeroNode> stack = new Stack<>();
        while (temp.getNext() != null){
            stack.push(temp.getNext());
            temp = temp.getNext();
        }
        while (stack.size()>0){
            System.out.println(stack.pop());
        }
    }

}

class SingleLinkedList{
    private HeroNode head = new HeroNode(0, "", "");

    public HeroNode getHead() {
        return head;
    }

    public void setHead(HeroNode head) {
        this.head = head;
    }

    public void update(HeroNode heroNode){
        HeroNode temp = head;
        while(temp.getNext() != null){
            if(temp.getNext().getRank() == heroNode.getRank()){
                heroNode.setNext(temp.getNext().getNext());
                temp.setNext(heroNode);
                break;
            }
            temp = temp.getNext();
        }
    }

    public void remove(int rank){
        HeroNode temp = head;
        while(temp.getNext() != null){
            if(temp.getNext().getRank() == rank){
                temp.setNext(temp.getNext().getNext());
                break;
            }
            temp = temp.getNext();
        }
    }

    public void add(HeroNode heroNode){
        HeroNode temp = head;
        while(temp.getNext() != null){
            temp = temp.getNext();
        }
        temp.setNext(heroNode);
    }

    public void addInOrder(HeroNode heroNode){
        HeroNode temp = head;
        while (temp!=null){
            if(temp.getNext()!=null){
                if(temp.getNext().getRank()>heroNode.getRank()){
                    heroNode.setNext(temp.getNext());
                    temp.setNext(heroNode);
                    break;
                }else if(temp.getNext().getRank() == heroNode.getRank()){
                    System.out.println("the rank is exist");
                    break;
                }
            }else{
                temp.setNext(heroNode);
                break;
            }
            temp = temp.getNext();
        }
    }

    public void print(){
        HeroNode temp = head.getNext();
        while (temp!=null){
            System.out.println(temp.toString());
            temp = temp.getNext();
        }
    }
}


class HeroNode{
    private String name;
    private String nickName;
    private int rank;
    private HeroNode next;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public HeroNode getNext() {
        return next;
    }

    public void setNext(HeroNode next) {
        this.next = next;
    }

    public HeroNode(int rank, String name, String nickName) {
        this.name = name;
        this.nickName = nickName;
        this.rank = rank;
    }

    @Override
    public String toString() {
        return "HeroNode{" +
                "name='" + name + '\'' +
                ", nickName='" + nickName + '\'' +
                ", rank=" + rank +
                ", next=" + next +
                '}';
    }
}