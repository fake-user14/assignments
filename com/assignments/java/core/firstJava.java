package com.assignments.java.core;

/*
1.Write a program to print whether a number is even or odd, also take input from the user.
2.Take name as input and print a greeting message for that particular name.
3.Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.
4.Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)
5.Take 2 numbers as input and print the largest number.
6.Input currency in rupees and output in USD.
7.To calculate Fibonacci Series up to n numbers.
8.To find out whether the given String is Palindrome or not.
9.To find Armstrong Number between two given number.
*/

import java.util.Scanner;

public class firstJava {

    //1.
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("Enter the number");
        for (int i = 0; i < 2; i++) {
            int num = sc.nextInt();
            if (num % 2 == 0) {
                System.out.println("even");
            } else {
                System.out.println("odd");
            }
        }
        //2. Take name as input and print a greeting message for that particular name.
        System.out.println("enter the name ");
        String name=sc.next();
        System.out.println("Namaste "+ name);

        //.Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.
        double principal= sc.nextInt();
        double time=sc.nextInt();
        double rate=sc.nextInt();
        double si=(principal*time*rate)/100;
        System.out.println(si);

        //6.Input currency in rupees and output in USD.
        System.out.println("enter amnt in rupees");
        double rs=sc.nextDouble();
        double conver=rs/80;
        System.out.println("amount in USD ="+conver);

    }
}
