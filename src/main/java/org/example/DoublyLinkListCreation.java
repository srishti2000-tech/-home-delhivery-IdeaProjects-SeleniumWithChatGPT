package org.example;

public class DoublyLinkListCreation {
    public static void main(String[] args) {
        DoublyLinkList d = new DoublyLinkList(20);
        DoublyLinkList d1 = new DoublyLinkList(30);
        DoublyLinkList d2 = new DoublyLinkList(40);
        d.next =d1;
        d1.prev = d;
        d1.next = d2;
        d2.prev =d1;
        printlistFromStart(d);
    }
        static void printlistFromStart(DoublyLinkList n){
            DoublyLinkList h = n;
            while (h!=null){
                System.out.println(h.data);
                h= h.next;
            }
        }
    }
    class DoublyLinkList{
        int data;
        DoublyLinkList prev;
        DoublyLinkList next;
        DoublyLinkList(int nodeToInsert){
            data=nodeToInsert;
            prev = null;
            next = null;
        }
    }

