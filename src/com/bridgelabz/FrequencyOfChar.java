package com.bridgelabz;

public class FrequencyOfChar {
    public static void main(String[] args) {
        String s = "This is cat";
        System.out.println("Character\tFrequency");
        for(char ch = 'a'; ch<='z'; ch++){
            int counter = 0;
            for(int i=0; i<s.length(); i++){
                if(ch == s.charAt(i)){
                    counter++;
                }
            }
            if(counter != 0){
                System.out.println(ch + "\t|\t\t" + counter);
            }
        }
    }
}
