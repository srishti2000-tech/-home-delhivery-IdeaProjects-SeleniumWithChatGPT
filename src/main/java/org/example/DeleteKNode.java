package org.example;

public class DeleteKNode extends InsertAtBeginInCircularLinkList{
    public static void main(String[] args) {
        circulaNode node = new circulaNode(40);
        node.next = new circulaNode(10);
        node.next.next = new circulaNode(20);
        node.next.next.next = new circulaNode(30);
        node.next.next.next.next = node;
        circulaNode cn =DelKNode(4,node);
        printMethod(cn);
    }
    static void printMethod(circulaNode n)
    {   circulaNode h = n;
        while (h.next!=n){
            System.out.println(h.data);
            h=h.next;
        }
        System.out.println(h.data);
    }
    static circulaNode DelKNode(int k,circulaNode head){
        circulaNode curr =head;
        if(k==1){
            head.data=head.next.data;
            k=2;
        }
            while (k > 2) {
                curr = curr.next;
                k--;
            }
            curr.next = curr.next.next;
        return head;
    }
}
class circulaNode{
    int data;
    circulaNode next;
    circulaNode(int x){
        data = x;
        next=null;
    }
}
