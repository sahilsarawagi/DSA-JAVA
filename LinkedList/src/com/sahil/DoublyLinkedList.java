package com.sahil;

public class DoublyLinkedList {
    private Node head;

    public DoublyLinkedList() {
        this.head = null;
    }
    public void insertFirst(int val){
        Node node = new Node(val);
        node.next=head;
        node.pre = null;
        if (head !=null) {
            head.pre = node;
        }
        head=node;

    }
    public void insertLast(int val){
        Node node = new Node(val);
        if (head==null){
            head = node;
            head.next=null;
            head.pre=null;
            return;
        }
        Node last = head;
        while (last.next!=null){
            last = last.next;
        }
        last.next = node;
        node.pre = last;
        node.next = null;

    }
    public Node find(int val){
        Node node = head;
        while (node!=null){
            if (node.val == val){
                return node;
            }
            node =node.next;
        }
        return null;
    }
    public void insert (int after ,int value){
        Node afterNode = find(after);
        if (afterNode==null) {
            System.out.println("No node has a value "+ after + " in a Linked List");
            return;
        }else {
            Node node = new Node(value);
            node.pre = afterNode;
            node.next = afterNode.next;
            if (node.next!=null){
                node.next.pre = node;
            }
            afterNode.next = node;

        }
    }
    public void display() {
        Node node = head;
        while (node!= null){
            System.out.print(node.val + "->");
            node =node.next;
        }
        System.out.println("END");
    }

    private class Node{
        int val;
        Node pre;
        Node next;

        public Node(int val) {
            this.val = val;
        }

        public Node(int val, Node pre, Node next) {
            this.val = val;
            this.pre = pre;
            this.next = next;
        }
    }
}
