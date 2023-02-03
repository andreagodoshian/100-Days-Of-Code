package org.example.day21to30;

public class LinkedListCustom {

    Node head;

    public void insert(int data) {
        Node newNode = new Node();
        newNode.data = data;

        if (head == null) head = newNode;
        else {
            Node n = head;
            while (n.nextNode != null) {
                n = n.nextNode;
            }
            n.nextNode = newNode;
        }
    }

    public void show() {
        Node node = head;
        //^^don't manipulate the head itself
        while (node.nextNode != null) {
            System.out.println(node.data);
            node = node.nextNode;
        }
        System.out.println(node.data);
        //^^printing the last node
    }

    public void insertAtStart(int data) {
        Node newNode = new Node();
        newNode.data = data;
        newNode.nextNode = head;

        head = newNode;
    }

    public void insertAt(int index, int data){
        Node newNode = new Node();
        newNode.data = data;

        Node nodeBeforeIndex = head;

        if (index == 0) insertAtStart(data); // escape hatch
        else {
            for (int i = 0; i < index - 1; i++) { // "index - 1"
                nodeBeforeIndex = nodeBeforeIndex.nextNode;
                // ^^finding node before desired index
            }
            newNode.nextNode = nodeBeforeIndex.nextNode;
            nodeBeforeIndex.nextNode = newNode;
        }
    }

    public void deleteAt(int index) {
        if (index == 0) { // escape hatch
            head = head.nextNode;
        } else {
            Node nodeBeforeIndex = head;
            Node nodeAtIndex = null;
            for (int i = 0; i < index - 1; i++) { // "index - 1"
                nodeBeforeIndex = nodeBeforeIndex.nextNode;
                // ^^finding node before desired index
            }
            nodeAtIndex = nodeBeforeIndex.nextNode;
            nodeBeforeIndex.nextNode = nodeAtIndex.nextNode;
            nodeAtIndex = null;
            // ^^now it's eligible for garbage collection
            // "GARBAGE COLLECTOR! BIG DECIMALS!"
        }
    }
}