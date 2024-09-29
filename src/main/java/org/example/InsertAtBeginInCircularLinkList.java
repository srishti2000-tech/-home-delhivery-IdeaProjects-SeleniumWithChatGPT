package org.example;


public class InsertAtBeginInCircularLinkList {
    public static void main(String[] args) {
        CircularNode node = new CircularNode(10);
        node.next = new CircularNode(20);
        node.next.next =new CircularNode(30);
        node.next.next.next=node;
        CircularNode newHead = addFirst(new CircularNode(40), node);
        printMethod(newHead);
    }
   static CircularNode addFirst(CircularNode k, CircularNode head) {
       k.next = head;
       CircularNode curr = head;
       while (curr.next!=head){
           curr=curr.next;
       }
       curr.next=k;

       //head.next.next.next = k;
       return k;
   }
    static void printMethod(CircularNode n)
    {
        CircularNode h = n;
        while (h.next!=n){
            System.out.println(h.data);
            h=h.next;

        }
        System.out.println(h.data);


    }
}
 class CircularNode{
    int data;
    CircularNode next;

    CircularNode(int x){
        data = x;
        next=null;

    }
    }
