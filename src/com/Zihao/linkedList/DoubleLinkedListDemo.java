package com.Zihao.linkedList;

public class DoubleLinkedListDemo {

    public static void main(String[] args){
        HeroNode2 heroNode1 = new HeroNode2(1, "宋江", "及时雨");
        HeroNode2 heroNode2 = new HeroNode2(2, "卢俊义", "玉麒麟");
        HeroNode2 heroNode3 = new HeroNode2(3, "吴用", "智多星");
        HeroNode2 heroNode4 = new HeroNode2(4, "林冲", "豹子头");
        HeroNode2 heroNode5 = new HeroNode2(2, "test", "test");

        DoubleLinkedList heros = new DoubleLinkedList();
        heros.addInOrder(heroNode4);
        heros.addInOrder(heroNode2);
        heros.addInOrder(heroNode3);
        heros.addInOrder(heroNode1);
//        heros.addInOrder(heroNode4);

//        heros.update(heroNode5);
//        heros.remove(3);

        heros.print();

    }
}
class DoubleLinkedList{
    private HeroNode2 head = new HeroNode2(0, "", "");

    public HeroNode2 getHead() {
        return head;
    }

    public void setHead(HeroNode2 head) {
        this.head = head;
    }

    public void add(HeroNode2 heroNode2){
        HeroNode2 temp = head;
        while (temp.getNext() != null){
            temp = temp.getNext();
        }
        temp.setNext(heroNode2);
        heroNode2.setPrevious(temp);
    }

    public void addInOrder(HeroNode2 heroNode2){
        HeroNode2 temp = head;
        while (temp.getNext() != null){
            if (temp.getNext().getRank() > heroNode2.getRank()){
                temp.getNext().setPrevious(heroNode2);
                heroNode2.setNext(temp.getNext());
                heroNode2.setPrevious(temp);
                temp.setNext(heroNode2);
                return;
            }else if(temp.getNext().getRank() == heroNode2.getRank()){
                System.out.println("the rank is already existed");
                return;
            }
            temp = temp.getNext();
        }
        temp.setNext(heroNode2);
        heroNode2.setPrevious(temp);
    }

    public void remove(int rank){
        HeroNode2 temp = head.getNext();
        while(temp != null){
            if(rank == temp.getRank()){
                HeroNode2 next  =temp.getNext();
                temp.getPrevious().setNext(next);
                if (next != null){
                    next.setPrevious(temp.getPrevious());
                }
                return;
            }
            temp = temp.getNext();
        }
        System.out.println("the rank is not existed");
    }

    public void update(HeroNode2 heroNode2){
        HeroNode2 temp = head.getNext();
        while(temp != null){
            if(heroNode2.getRank() == temp.getRank()){
                temp.getPrevious().setNext(heroNode2);
                temp.getNext().setPrevious(heroNode2);
                heroNode2.setPrevious(temp.getPrevious());
                heroNode2.setNext(temp.getNext());
                return;
            }
            temp = temp.getNext();
        }
        System.out.println("the rank is not existed");
    }

    public void print(){
        HeroNode2 temp = head.getNext();
        while (temp!=null){
            System.out.println(temp.toString());
            temp = temp.getNext();
        }
    }
}

class HeroNode2 {
    private String name;
    private String nickName;
    private int rank;
    private HeroNode2 next;
    private HeroNode2 previous;

    public HeroNode2 getPrevious() {
        return previous;
    }

    public void setPrevious(HeroNode2 previous) {
        this.previous = previous;
    }

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

    public HeroNode2 getNext() {
        return next;
    }

    public void setNext(HeroNode2 next) {
        this.next = next;
    }

    public HeroNode2(int rank, String name, String nickName) {
        this.name = name;
        this.nickName = nickName;
        this.rank = rank;
    }

    @Override
    public String toString() {
        return "HeroNode2{" +
                "name='" + name + '\'' +
                ", nickName='" + nickName + '\'' +
                ", rank=" + rank +
                ", next=" + next +
                '}';
    }
}
