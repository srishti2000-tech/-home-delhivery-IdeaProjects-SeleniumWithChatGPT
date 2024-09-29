package org.example;

public class TraverseLinkedList {
    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);

        /*Node h = head;
        while(h!=null){
            System.out.println(h.data);
            h =  h.next;

        }*/
        printMethod(head);
    }
    static void printMethod(Node n)
    {
        Node h = n;
        if(h!=null){
            System.out.println(h.data);
            printMethod(h.next);
        }

    }
}
class Node{
    int data;
    Node next = null;
    Node(int x){
        data = x;
    }
}
