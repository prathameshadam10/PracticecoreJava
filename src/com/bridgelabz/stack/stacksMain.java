package com.bridgelabz.stack;

public class stacksMain {
    public static void main(String[] args) {
        Stacks s = new Stacks();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);
        s.push(6);

        while (!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }
}
