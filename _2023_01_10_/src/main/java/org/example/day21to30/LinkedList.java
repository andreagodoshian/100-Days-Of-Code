package org.example.day21to30;

public class LinkedList {
    // it's in a different package soooooooo it's fine?

    Node head;

    public void insert(int data) {
        Node node = new Node();
        node.data = data;

        if (head == null) head = node;
        else {
            Node n = head;
            while (n.next != null) {
                n = n.next;
            }
            n.next = node;
        }
    }

    public void show() {
        Node node = head;
        while (node.next != null) {
            System.out.println(node.data);
            node = node.next;
        }
        System.out.println(node.data);
    }
}
