package com.assignments.java.core;

public class strings{
    public static void main(String[] args) {
        String s="abhijeet";
        String reverse=reverseString(s);
        System.out.println(reverse);
        String rep =String.valueOf(maxRepChar(s));
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

    public static char maxRepChar(String c){

         String s="abbccccccvv";
         int[] arr=new int[127];
         for (int i=0; i<s.length();i++){
             arr[s.charAt(i)]=arr[s.charAt(i)]+1;
         }
         int max=-1;
          char ssc=' ';
         for (int i=0;i<s.length(); i++){
             if (max<arr[s.charAt(i)]){
                 max=arr[s.charAt(i)];
                 ssc=s.charAt(i);
             }
         }
         return ssc;
    }
}