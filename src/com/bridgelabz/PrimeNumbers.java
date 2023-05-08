package com.bridgelabz;

public class PrimeNumbers {
    public static void main(String[] args) {
        int a = 1, b = 100;
        for (int i = a; i <= b; i++) {
            if (checkPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }

    private static boolean checkPrime(int num) {
        if (num < 2) {
            return false;
        } else {
            for (int i = 2; i < num / 2; i++) {
                if (num % i == 0)
                    return false;
            }

        }
        return true;

}
}