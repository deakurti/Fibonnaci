package com.company;

public class Main {
    public static void main (String[]args)
    {
        printFibonnaci (100);
    }

    public static void printFibonnaci (int n) {
        int num1 = 1;
        int num2 = 1;
        int num3 = 0;
        System.out.println(num1);
        System.out.println(num2);
        while (num1 < n){
            num3 = num1 + num2;
            System.out.println(num3);
            num2 = num3 + num1;
            System.out.println (num2);
            num1 = num2 + num3;
            System.out.println(num1);
        }

    }
}
