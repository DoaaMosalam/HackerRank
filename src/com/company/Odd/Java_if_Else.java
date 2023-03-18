package com.company.Odd;

import java.util.*;


/**
 * Given an integer, , perform the following conditional actions:
 *
 * If  is odd, print Weird
 * If  is even and in the inclusive range of 2 to 5 , print Not Weird
 * If  is even and in the inclusive range of 6 to 20 , print Weird
 * If  is even and greater than 20, print Not Weird
 *
 * Sample Case 0: n=3
 *  n is odd and odd numbers are weird, so we print Weird.
 *
 * Sample Case 1: n= 24
 * n > 20 and  is even, so it isn't weird. Thus, we print Not Weird.
 */

public class Java_if_Else {
    public void javaifelse() {
        System.out.println("Enter Your number: ");
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
       if (N % 2 !=0){
           System.out.println("Weird");
       }else {
           if (N %2 == 0 ){
               System.out.println("Not Weird");
           }else if (N>=2 && N<=5){
               System.out.println("Not Weird");
           }else if (N>=6 && N<=20){
               System.out.println("Weird");
           }
           else {
               System.out.println("Not Weird");
           }
       }
    }



    public static void main(String[] args) {
        Java_if_Else javaIfElse = new Java_if_Else();
       javaIfElse.javaifelse();

    }




}
