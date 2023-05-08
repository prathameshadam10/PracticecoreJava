package com.bridgelabz;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FilleIO {
    public static void main(String[] args) {
//        Creating a new file
        File myFile = new File("myfile.txt");
        try {
            myFile.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }

//        Code to write a file
        try {
            FileWriter fileWriter = new FileWriter("myfile.txt");
            fileWriter.write("This is our First file from java course");
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
//      code to read a file
        try {
            Scanner sc = new Scanner(myFile);
            while(sc.hasNextLine()){
                String line = sc.nextLine();
                System.out.println(line);
            }
            sc.close();
        } catch (FileNotFoundException e) {
           e.printStackTrace();
        }

//        Code to delete to file
        if(myFile.delete()){
            System.out.println("I have Deleted :" + myFile.getName());
        } else {
            System.out.println("some problem occured while deleteing");
        }
    }
}
