package com.bridgelabz;

public class SecondLargestElement {
    public static void main(String[] args) {
        int array [] = {63,83,33,44,86,4,32,38};
        int temp;
        for(int i=0; i<array.length; i++){
            for(int j=i+1; j<array.length; j++){
                if(array[i] < array[j]){
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }

        System.out.println("largest Element :" + array[0]);
        System.out.println("Second Largest Element :" + array[1]);

        System.out.println("Array after sorting");
        for(int x : array){
            System.out.println(x);
        }
    }
}
