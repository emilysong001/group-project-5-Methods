package com.devxschool;

import java.util.Scanner;

public class BookShop {
    public static void main(String[] args) {
        /**
         * Online Book Merchant offers premium customers 1 free book with every purchase of 5 or more books
         * and offers 2 free books with every purchase of 8 or more books.
         * It offers regular customers 1 free book with every purchase of 7 or more books
         * and offers 2 free books with every purchase of 12 or more books.
         *
         * Write a program to calculate number of free books.
         *
         *  sample output:
         * Are you a premium customer?
         * true
         * How many books for purchase?
         * 9
         * You qualify for 2 free books
         *
         */

        int freeBooks, numberOfBooksPurchased;
        boolean isPremiumCustomer;
        Scanner scanner = new Scanner(System.in);
        //TODO write your code here
        System.out.println("Are you a premium customer?");
        isPremiumCustomer = scanner.nextBoolean();
        System.out.println("How many books for purchase?");
        numberOfBooksPurchased = scanner.nextInt();
        freeBooks = countFreeBooks(isPremiumCustomer, numberOfBooksPurchased);
        System.out.println("You qualify for " + freeBooks + " free books");

    }

    public static int countFreeBooks(boolean isPremiumCustomer, int numberOfBooks) {
        //TODO implement method
        if (isPremiumCustomer) {
            if (numberOfBooks >= 5 && numberOfBooks < 8) {
                return 1;
            } else if (numberOfBooks >= 8) {
                return 2;
            } else if (numberOfBooks < 5 && numberOfBooks >= 0) {
                return 0;
            }
        } else {
            if (numberOfBooks >= 7 && numberOfBooks < 12) {
                return 1;
            } else if (numberOfBooks >= 12) {
                return 2;
            } else if (numberOfBooks < 7 && numberOfBooks >= 0) {
                return 0;
            }
        }
        return -1;
    }
}
