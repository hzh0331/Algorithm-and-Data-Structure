package com.Zihao.linkedList;

public class Josephu {
    public static void main(String[] args){
        CircleSingleLinkedList circleSingleLinkedList = new CircleSingleLinkedList();
        circleSingleLinkedList.addBoy(5);
        circleSingleLinkedList.print();
        circleSingleLinkedList.countBoy(1,2);
    }

}

class CircleSingleLinkedList{
    private Boy first = null;

    public void addBoy(int nums){
        Boy current = null;
        for(int i = 1; i <= nums; i++){
            Boy boy = new Boy(i);
            if(i == 1){
                boy.setNext(boy);
                first = boy;
            }else{
                current.setNext(boy);
                boy.setNext(first);
            }
            current = boy;

        }

    }

    public void print(){
        Boy current = first;
        while (true){
            System.out.println(current.toString());
            if (current.getNext() == first){
                break;
            }
            current = current.getNext();
        }
    }

    public void countBoy(int start, int count){
//        Boy current = first;
        for (int i = 1; i < start; i++){
            first = first.getNext();
        }
        Boy helper = first;
        int nums = 0;
        while(helper.getNext()!=first){
            helper = helper.getNext();
            nums++;
        }
        System.out.println(helper.getNo());
        while (true){
            if (helper == first){
                System.out.println(helper.getNo());
                break;
            }
            for (int i = 0; i < count-1; i++){
                first = first.getNext();
                helper = helper.getNext();
            }
            System.out.println(first.getNo());
            first = first.getNext();
            helper.setNext(first);
        }
    }
}

class Boy{
    private int no;
    private Boy next;

    public Boy(int no) {
        this.no = no;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public Boy getNext() {
        return next;
    }

    public void setNext(Boy next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "Boy{" +
                "no=" + no +
                '}';
    }
}
