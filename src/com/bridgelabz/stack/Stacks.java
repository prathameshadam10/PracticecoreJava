package com.bridgelabz.stack;

public class Stacks {
    Node head;
    public boolean isEmpty(){
        return  head == null;
    }
    public void push(int data){
        Node newNode = new Node(data);
        if(isEmpty()) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }
    public  int pop(){
        if(isEmpty()){
            return -1;
        }
       int top = head.data;
        head = head.next;
        return top;
    }

    public int  peek(){
        if(isEmpty()){
            return -1;
        }
        return head.data;
    }
}
