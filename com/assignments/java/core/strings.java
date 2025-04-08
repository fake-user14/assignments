package com.assignments.java.core;

public class strings{
    public static void main(String[] args) {
        String s="abhijeet";
        String reverse=reverseString(s);
        System.out.println(reverse);
        if (isPalindrome(s)){
            System.out.println("yes, palindrome");
        }
        else
        {
            System.out.println("no, not a palindrome");
        }
    }

    public static String reverseString(String s){
        String rev="";
        for (int i=s.length()-1;i>=0;i--){
            rev+=s.charAt(i);
        }
        return(rev);
    }
    public static boolean isPalindrome(String s){

        return s.equals(reverseString(s));
    }
}