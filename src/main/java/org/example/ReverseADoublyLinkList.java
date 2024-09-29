package org.example;

public class ReverseADoublyLinkList {
    public static void main(String[] args) {
        Doubly d1 = new Doubly(10);
        Doubly d2 = new Doubly(20);
        Doubly d3 = new Doubly(30);
        d1.next =d2;
        d2.prev =d1;
        d2.next =d3;
        d3.prev =d2;
        Doubly d = revDoubly(d1);
        printMethod(d);
    }
    static Doubly revDoubly(Doubly h){
      if (h.prev==null&&h.next==null) {
            return h;
        }
      while(h.next!=null) {

          Doubly temp = h.next;
          h.next = h.prev;
          h.prev = temp;
          h=temp;
      }
        Doubly K =h;
        h.next = h.prev;
        h.prev = null;
        return K;

    }
    static void printMethod(Doubly n)
    {
        Doubly h = n;
        if(h!=null){
            System.out.println(h.data);
            printMethod(h.next);
        }

    }
}
class Doubly{
    int data;
    Doubly next;
    Doubly prev;
    Doubly(int k){
       data = k;
       next = null;
       prev = null;

    }
}
