package com.bridgelabz;

import java.util.Scanner;

public class TwoDArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter No of rows And columns");
        int rows = sc.nextInt();

        int colm = sc.nextInt();
        int numbers [] [] = new int [rows][colm];
        System.out.println("Give Input for Elements in array");

        for(int i=0; i<rows; i++){
            for(int j=0; j<colm; j++){
                numbers[i] [j] = sc.nextInt();
            }
        }
        System.out.println("Displaying elements in array");
        for(int i=0; i<rows; i++){
            for(int j=0; j<colm; j++){
                System.out.print(numbers[i][j] +" " );
            }
            System.out.println();
        }
    }
}
