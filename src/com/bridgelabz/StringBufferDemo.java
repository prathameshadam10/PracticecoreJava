package com.bridgelabz;

public class StringBufferDemo {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello Abhishek");
        System.out.println(sb);
        System.out.println(sb.append(" Kotha"));
//        System.out.println(sb.substring(1));
//        System.out.println(sb.substring(1,4));
//        System.out.println(sb.substring(2));
//        System.out.println(sb.substring(5));
//        System.out.println(sb.insert(6, "Sir "));
//        System.out.println(sb.replace(0,5, "Kotha"));
        System.out.println(sb.reverse());
    }
}
