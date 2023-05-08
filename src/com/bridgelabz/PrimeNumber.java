package com.bridgelabz;

import java.util.ArrayList;
import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        Scanner sc = new Scanner(System.in);
        int temp = 0;
        for(int i=2; i<=1000; i++){
            for(int j=2; j<i-1; j++){
                if(i % j == 0){
                    temp = temp + 1;
                }
            }
            if(temp == 0){
//                System.out.println(i);
                arrayList.add(i);

            }
            else {
                temp = 0;
            }
        }
        System.out.println(arrayList);

    }

}