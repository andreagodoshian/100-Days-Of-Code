package org.example.day21to30;
/*
Runs a custom Linked List,
to understand how Linked Lists work
Source: https://www.youtube.com/watch?v=AeqXFjCUcQM
 */
public class Runner {
    public static void main(String[] args) {

        LinkedListCustom list = new LinkedListCustom();

        list.insert(18);
        list.insert(45);
        list.insert(77);
        list.insertAtStart(1);
        list.insertAt(0, 0);
        list.insertAt(3, 22);
        System.out.println("Deleting 45...");
        list.deleteAt(4);

        list.show();
    }
}