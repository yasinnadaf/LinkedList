package com.bridgelabz.linkedlist;

public class LinkedListMain {
    
    public static void main(String[] args) {

        LinkedList<Integer> linkedList = new LinkedList<>();

        linkedList.push(70);
        linkedList.push(30);
        linkedList.push(56);

        linkedList.print();
        System.out.println();

        if (linkedList.search(30) != null)
            System.out.println("Element Found in list");
        else
            System.out.println("Element not Found in list");
    }
    
}

