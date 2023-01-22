package com.devxschool;

import java.util.Scanner;

public class Converter {
    public static void main(String[] args) {

        /**
         *
         * Write a java program that calculates to metric system
         * if incorrect input print result as -1
         *
         * 1 lb = 0.45359237 kg
         * 1kg = 1000g
         * 1 lb = 453.59237 g
         * 1 oz = 28.34952 g
         *
         * 1 ft = 0.3048 m
         * 1 ft = 30.48 cm
         * 1 in = 2.54cm
         *
         * C = (F - 32) × 5/9
         *
         *
         * Example output:
         * Enter amount:
         * 1
         * Enter type:
         * in
         * To:
         * cm
         * Result: 2.54
         *
         */

        Scanner scanner = new Scanner(System.in);
        Converter converter = new Converter();
        System.out.println("Enter amount:");
        Double amount = scanner.nextDouble();
        System.out.println("Enter type:");
        scanner.nextLine();
        String type = scanner.nextLine();
        System.out.println("To:");
        String to = scanner.nextLine();

        /*if (isWeight(type) && isWeight(to)) {
            System.out.println("Result:" + calculateWeight(type, to, amount));
        } else if (isLength(type) && isLength(to)) {
            System.out.println("Result:" + calculateLength(type, to, amount));
        } else if (isTemperature(type) && isTemperature(to)) {
            System.out.println("Result:" + calculateTemperature(type, to, amount));
        } else {
            System.out.println("Wrong Input");
        }*/
        if (isWeight(type) && isWeight(to)) {
            printResult(calculateWeight(type, to, amount));
        } else if (isLength(type) && isLength(to)) {
            System.out.println("Result:" + calculateLength(type, to, amount));
        } else if (isTemperature(type) && isTemperature(to)) {
            System.out.println("Result:" + calculateTemperature(type, to, amount));
        } else {
            System.out.println("Wrong Input");
        }

        //TODO write your code here

    }


    public static boolean isWeight(String type) {
        //TODO IMPLEMENT METHOD
        return type.equalsIgnoreCase("kg") || type.equalsIgnoreCase("g") || type.equalsIgnoreCase("lb") || type.equalsIgnoreCase("oz");
    }

    public static boolean isLength(String type) {
        //TODO IMPLEMENT METHOD
        return type.equalsIgnoreCase("m") || type.equalsIgnoreCase("cm") || type.equalsIgnoreCase("ft") || type.equalsIgnoreCase("in");
    }

    public static boolean isTemperature(String type) {
        //TODO IMPLEMENT METHOD
        return type.equalsIgnoreCase("F") || type.equalsIgnoreCase("C");
    }

    public static double calculateWeight(String type, String to, double amount) {
        //TODO IMPLEMENT METHOD
        if (isWeight(type) && isWeight(to)) {
            /*if (type.equalsIgnoreCase("lb") && to.equalsIgnoreCase("kg")) {
                return 0.45359237 * amount;
            } else if (type.equalsIgnoreCase("oz") && to.equalsIgnoreCase("g")) {
                return 28.34952 * amount;
            }*/
            switch (type) {
                case "lb":
                    switch (to) {
                        case "kg":
                            return 0.45359237 * amount;
                        case "g":
                            return 453.59237 * amount;
                    }
                    break;
                case "oz":
                    switch (to) {
                        case "kg":
                            return 0.02834952 * amount;
                        case "g":
                            return 28.34952 * amount;
                    }
            }
        }
        return -1;
    }

    public static double calculateLength(String type, String to, double amount) {
        //TODO IMPLEMENT METHOD
        if (isLength(type) && isLength(to)) {
            if (type.equalsIgnoreCase("ft") && to.equalsIgnoreCase("m")) {
                return 0.3048 * amount;
            } else if (type.equalsIgnoreCase("ft") && to.equalsIgnoreCase("cm")) {
                return 30.48 * amount;
            } else if (type.equalsIgnoreCase("in") && to.equalsIgnoreCase("cm")) {
                return 2.54 * amount;
            }
        }
        return -1;
    }

    public static double calculateTemperature(String type, String to, double amount) {
        // TODO IMPLEMENT METHOD
        if (isTemperature(type) && isTemperature(to)) {
            if (type.equalsIgnoreCase("F") && to.equalsIgnoreCase("C")) {
                return (amount - 32) * 5 / 9;
            }
        }
        return -1;
    }

    public static void printResult(double result) {
        // TODO IMPLEMENT METHOD
        System.out.println("result" + result);

    }
}
