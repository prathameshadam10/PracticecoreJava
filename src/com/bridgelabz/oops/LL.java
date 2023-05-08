package com.bridgelabz.oops;


public class LL {
   Node head;
   Node tail;
   public void addFirst(String data){
       Node newNode = new Node (data);
       if(head == null){
           head = newNode;
           tail = newNode;
           return;
       }
       else {
           newNode.next = head;
           head = newNode;
       }
   }
   public void addLast(String data){
//
       Node newNode = new Node(data);
       if(head == null){
           head=newNode;
           tail=newNode;
       }
       else {
           tail.next=newNode;
           tail=newNode;
       }

   }

   public void printList(){
//  m.out.println("Null");
       Node temp = head;
       while(temp!= null)
       {
           System.out.print(temp.data + "-> ");
           temp= temp.next;
       }
   }
   public void deleteFirst(){
       if(head == null){
           System.out.println("List is Empty");
       }
       else
           head = head.next;

   }
   public void deleteLast(){
       if(head == null){
           System.out.println("List is Empty");
       }
       if(head.next == null){
           head = null;
       }
       Node secondLast = head;
       Node lastNode = head.next;
       while(lastNode.next != null){
           lastNode = lastNode.next;
           secondLast = secondLast.next;
       }
       secondLast.next = null;
   }

    public void deleteAnyelement( String delete) {
        if (head == null) {
            return;
        }

        if (head.data.equals(delete)) {
            head = head.next;
            return;
        }

        Node prev = head;
        Node current = head.next;

        while (current != null) {
            if (current.data.equals(delete)) {
                System.out.println("DATA DELETED SUCCESSFULLY");
                prev.next = current.next;
                return;
            }
            prev = current;
            current = current.next;
        }
    }
    public void search(String search) {
        Node  temp = head;
        boolean flag= false;
        while(temp!=null)
        {
            if(temp.data.equals(search))
            {
                flag=true;
                deleteAnyelement(search);
            }
            temp=temp.next;
        }
        if(!flag){
            addLast(search);
            System.out.println("data added successfully");
        }
    }

}
