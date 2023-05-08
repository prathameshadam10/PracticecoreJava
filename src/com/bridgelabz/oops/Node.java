package com.bridgelabz.oops;

public class Node {
    String data;
    Node next;

    public Node() {
    }

    public Node(String data) {
        this.data = data;
        this.next = null;
    }

    @Override
    public String toString() {
        return "Node{" +
                "data='" + data + '\'' +
                ", next=" + next +
                '}';
    }
}
