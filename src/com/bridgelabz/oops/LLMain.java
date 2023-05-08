package com.bridgelabz.oops;

public class LLMain {
    public static void main(String[] args) {
        LL list = new LL();
        list.addFirst("a");
        list.addLast("Prathamesh");

        list.printList();
        System.out.println();
        list.addFirst("is");
        list.addFirst("this");
        list.printList();
        System.out.println();
        list.search("is");
        list.printList();

//        list.addFirst("a");
//        list.addFirst("is");
//        list.addFirst("this");
//        list.addLast("list");
//        list.printList();
//        System.out.println();
//        list.deleteFirst();
//        list.deleteLast();
//        list.printList();
//        System.out.println();
//        list.addFirst("this");
//
//        list.search("is");
//
//        list.printList();




    }
}
