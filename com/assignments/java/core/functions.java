package com.assignments.java.core;

import java.util.Scanner;

public class functions {
   // Define two methods to print the maximum and the minimum number respectively among three numbers entered by the user.
   public static void main(String[] args) {
       System.out.println("enter 3 digits");
       Scanner sc=new Scanner(System.in);
       int n1=sc.nextInt();
       int n2=sc.nextInt();
       int n3=sc.nextInt();
       int maximu=maxx(n1,n2,n3);
       int minium=minn(n1,n2,n3);
       System.out.println("max="+maxx(n1,n2,n3));
       System.out.println("min="+minium);

   }
   static int maxx(int n1,int n2,int n3){
       int max=n1;
       if (n1>max){
           max=n1;
       }if (n2>max){
           max=n2;
       }if (n3>max) {
           max = n3;
       }
       return max;
   }
   static int minn(int n1,int n2,int n3){
       int min=n1;
       if(n1<min){
           min=n1;
       }
       if (n2<min){
           min=n2;
       }
       if (n3<min){
           min=n3;
       }
       return min;
   }
}
