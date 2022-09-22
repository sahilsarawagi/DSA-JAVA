package com.sahil;

public class SinglyCustomLinkedList {
    private Node head;
    private Node tail;
    private int size;

    public SinglyCustomLinkedList() {
        this.size=0;
    }
    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        head = node;
        if (tail==null){
            tail = head;
        }
        size++;
    }
    public void insertLast(int val){
        if (tail == null){
            insertFirst(val);
            return;
        }
        Node node = new Node(val);
        tail.next =node;
        tail =node;
        size++;
    }
    public void insert(int val ,int index){
        if(index == 0){
            insertFirst(val);
        }
        if(index == size){
            insertLast(val);
        }
        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp=temp.next;
        }
        Node node = new Node(val,temp.next);
        temp.next = node;
        size++;
    }
    public int deleteFirst(){
        int val = head.value;
        head =head.next;
        if (head==null){
            tail=null;
        }
        size--;
        return val;
    }
    public int delete(int index){
        if (index == 0){
            return deleteFirst();
        }
        if (index == size-1){
          return deleteLast();
        }
        Node previous = get(index-1);
        int DeletingNodeValue = previous.next.value;
        previous.next=previous.next.next;
        size--;
        return DeletingNodeValue;
    }
    public int findIndex(int value){
        Node temp = head;
        int index=0;
        while (temp!=null){
            if (temp.value ==value){
                return index;
            }
            index++;
            temp=temp.next;
        }
        return -1;
    }
    public Node find(int value){
        Node temp = head;
        while (temp!=null){
            if (temp.value ==value){
                return temp;
            }
            temp=temp.next;
        }
        return temp;
    }
    public Node get(int index){
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp;
    }
    public int deleteLast(){
        if (size <= 1) {
            return deleteFirst();
        }
        int val = tail.value;
        Node node = get(size-2);
        tail = node;
        tail.next = null;
        size--;
        return val;
    }
    public void display(){
        Node temp = head;
        while (temp!=null){
            System.out.print(temp.value + "->");
            temp = temp.next;
        }
        System.out.println("END");
    }
    private class Node{
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }
}
