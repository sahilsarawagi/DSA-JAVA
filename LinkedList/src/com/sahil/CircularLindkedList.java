package com.sahil;




public class CircularLindkedList {
    private Node head;
    private Node tail;

    public CircularLindkedList() {
        this.head =null;
        this.tail = null;
    }
    public void insert(int val){
        Node node = new Node(val);
        if (head==null){
            head =node;
            tail =node;
        }else {
            node.next=head;
            tail.next = node;
            tail =node;
        }
    }

    public void display() {
        Node node =head;
        if (head!=null){

        do {
            System.out.print(node.val + "->");
            if (node.next!=null){
                node=node.next;
            }
        }while (node!=head);
        System.out.println("HEAD");

        }
    }
    public Node get(int val){
        Node node = tail;
        if (node.next!=null){
            do {
                if (node.next.val == val){
                    return node;
                }
                if (node.next!=null){
                    node =node.next;
                }
            }while (node.next!=head);
        }
        return null;
    }
    public void delete(int val){
        Node node = get(val);
        if (node==null){
            System.out.println("No node with value " + val + " in Linked List");
        }else {
            if (head == tail ){
                head = null;
                tail = null;
            }else {
                if (node.next == tail) {
                    tail = node;
                }
                else if (node.next==head) {
                    head=node.next.next;
                }
                node.next = node.next.next;
            }
        }

    }

    private class Node {
        private int val;
        private Node next;

        public Node(int val) {
            this.val = val;
        }

        public Node(int val, Node next) {
            this.val = val;
            this.next = next;

        }
    }
}
