package com.example.search;

public class LinkedListTestOne {

    Node head = null;

    public void addToFront(int val) {
        Node n = new Node();
        n.val = val;
        n.next = head;

        head = n;
    }

    public void addToLast(int val) {
        Node newNode = new Node();
        newNode.val = val;
        newNode.next = null;

        if (head == null) {
            head = newNode;
        } else {
            Node tempNode = head;
            while (tempNode.next != null) {
                tempNode = tempNode.next;
            }

            tempNode.next = newNode;
        }
    }

    public void delete(int key) {

        Node tempNode = head;

        while (tempNode.next != null) {
            if (tempNode.next.val == key) {
                tempNode.next = tempNode.next.next;
                break;
            } else
                tempNode = tempNode.next;
        }


    }



}
