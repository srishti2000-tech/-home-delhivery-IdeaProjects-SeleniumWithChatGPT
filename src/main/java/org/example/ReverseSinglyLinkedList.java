//package org.example;
//
//public class ReverseSinglyLinkedList extends TraverseLinkedList {
//    public static void main(String[] args) {
//        Node n = new Node(10);
//        n.next = new Node(20);
//        n.next.next = new Node(30);
//        printMethod(RevNode(n));
//
//    }
//    static Node RevNode(Node n){
//        Node curr =n;
//        if(n==null){
//            return null;
//        } else if (n.next==null) {
//            return n;
//        }
//        Node next = curr.next;
//        Node prev = null;
//        while(curr!=null){
//            curr.next = prev;
//            prev = curr;
//            curr = next;
//            if(next!=null){
//            next = next.next;}
//        }
//
//        return prev;
//    }
//
//    public static class Exercise {
//
//        String BookTitle;
//        String BookAuthor;
//        static int BookCount;
//
//        Exercise(String title, String author){
//            BookCount++;
//            BookTitle = title;
//            BookAuthor = author;
//        }
//        public static int totalNumberOfBooks{
//            return BookCount;
//        }
//
//        public String getTitle{
//            return BookTitle;
//        }
//        public String getAuthor{
//            return BookAuthor;
//        }
//        public static void main (String[] args) {
//
//        }
//        // Example usage
//        Exercise book1 = new Exercise("The Great Gatsby", "F. Scott Fitzgerald");
//        Exercise book2 = new Exercise("1984", "George Orwell");
//
//            System.out.println("Total books created: " + Exercise.totalNumberOfBooks()); // Output: 2
//            System.out.println("Title of book1: " + book1.getTitle()); // Output: The Great Gatsby
//            System.out.println("Author of book2: " + book2.getAuthor()); // Output: George Orwell
//    }
//}
//
