package com.bridgelabz;

import java.util.Scanner;

public class Array {
    public static void inputArray(int array[]){
        Scanner sc = new Scanner(System.in);
        for(int i=0; i<array.length; i++){
            array[i] = sc.nextInt();
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of Array");
        int size = sc.nextInt();
        int array [] = new int[size];
        System.out.println("Enter the Elements in Array");
        inputArray(array);
        System.out.println("Elements in Array are");
        outputArray(array);
        largestElement(array);
        smallestElement(array);
        sumOfElements(array);
//        secondSmallestElements(array);
//        secondLargestElements(array);
        System.out.println("Reverse Elements in Array");
            reverseArray(array);


    }

    private static void reverseArray(int[] array) {
        for(int i = array.length-1; i >=0; i--){
            System.out.println(array[i]);
        }
    }

//    private static void secondLargestElements(int[] array) {
//        int temp;
//        for(int i=0; i< array.length; i++){
//            for(int j=i+1; j< array.length - 1; j++){
//                if(array[i] < array[j]){
//                    temp = array[i];
//                    array[i] = array[j];
//                    array[j] = temp;
//
//                }
//            }
//        }
//        System.out.println("Second Largest Element in Array :" + array[1]);
//    }

//    private static void secondSmallestElements(int[] array) {
//        int temp;
//        for(int i=0; i< array.length; i++){
//            for(int j=i+1; j< array.length - 1; j++){
//                if(array[i] > array[j]){
//                    temp = array[i];
//                    array[i] = array[j];
//                    array[j] = temp;
//
//                }
//            }
//        }
//        System.out.println("Second Smallest Element in Array :" + array[1]);
//    }

    private static void sumOfElements(int[] array) {
        int sum = 0;
        for(int i=0; i< array.length; i++){
            sum = sum + array[i];
        }
        System.out.println("Sum of Elements in Array :" + sum);
    }

    private static void largestElement(int[] array) {
        int max = array[0];
        for (int i=0; i<array.length; i++){
            if(max < array[i]){
                max = array[i];

            }
        }
        System.out.println("Largest Element in Array :" + max);
    }
    private static void smallestElement(int[] array) {
        int min = array[0];
        for (int i=0; i<array.length; i++){
            if(min > array[i]){
                min = array[i];

            }
        }
        System.out.println("Smallest Element in Array :" + min);
    }


    private static void outputArray(int[] array) {
        for(int x : array){
            System.out.println(x);
        }

    }
}
