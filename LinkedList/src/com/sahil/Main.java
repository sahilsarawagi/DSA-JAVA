package com.sahil;



public class Main {
    public static void main(String[] args) {
//        SinglyCustomLinkedList li = new SinglyCustomLinkedList();
//        li.insertFirst(5);
//        li.insertFirst(56);
//        li.insertFirst(6);
//        li.insertFirst(33);
//        li.display();
//        li.insertLast(77);
//        li.display();
//        li.insert(55,3);
//        li.display();
//        System.out.println(li.deleteFirst());
//        li.display();
//        System.out.println(li.deleteLast());
//        li.display();
//        System.out.println(li.delete(2));
//        li.display();
//        System.out.println(li.findIndex(5));
//      DoublyLinkedList li = new DoublyLinkedList();
//        li.insertFirst(5);
//        li.insertFirst(56);
//        li.insertFirst(6);
//        li.insertFirst(33);
//        li.display();
//        li.insert(56,8);
//        li.display();

        CircularLindkedList li = new CircularLindkedList();
        li.insert(5);
        li.insert(56);
        li.insert(6);
        li.insert(33);
        li.display();
        li.delete(6);
        li.delete(33);
        li.delete(56);
        li.delete(5);
        li.display();
        li.insert(7);
        li.display();




    }
}
