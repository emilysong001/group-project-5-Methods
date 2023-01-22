package com.devxschool;

import java.util.Scanner;

public class Discount {
    public static void main(String[] args) {


        /**
         * Write a java program to calculate discount for a product
         *
         *  sample output:
         * Marked price:
         * 100
         * Discount rate:
         * 25
         * Amount after discount: 75.0
         */

        double markedPrice, discount, amount;
        Scanner scanner = new Scanner(System.in);

        //TODO WRITE YOUR CODE HERE
        System.out.println("Marked price:");
        markedPrice = scanner.nextDouble();
        System.out.println("Discount rate:");
        discount = scanner.nextDouble();

        amount = calculateDiscount(markedPrice,discount);
        System.out.println("Amount after discount: "+amount);
    }

    public static double calculateDiscount(double markedPrice, double discount) {
        //TODO IMPLEMENT METHOD;
        if (markedPrice >= 0) {
            return markedPrice- markedPrice * discount/100;
        }
        return -1;
    }

    public static void printMessage(String message) {
        //TODO IMPLEMENT METHOD
    }
}
