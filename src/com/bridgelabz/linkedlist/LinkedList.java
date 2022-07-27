package com.bridgelabz.linkedlist;

public class LinkedList <T> {


    Node<T> head;
    Node<T> tail;

    public void push(T key) {
        Node<T> newNode = new Node<>(key);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    public void add(T key) {
        Node<T> newNode = new Node<>(key);
        if(head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    public void print() {
        Node<T> temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
    }



}
