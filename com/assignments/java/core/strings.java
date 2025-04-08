package com.assignments.java.core;

public class strings {

    public static void main(String[] args) {

        String s="abba";
        String rev = "";
        for (int i=s.length()-1; i>=0;i--){
            rev= rev + s.charAt(i);
        }
        System.out.println(rev);
        // how to check if string is a palindrome or not
        if (s.equals(rev)){
            System.out.println(" palidrone");

        }else {
            System.out.println("not palindrone");
        }
    }

    }
