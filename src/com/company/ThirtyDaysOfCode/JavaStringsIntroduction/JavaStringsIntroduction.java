package com.company.ThirtyDaysOfCode.JavaStringsIntroduction;

import java.util.Scanner;

public class JavaStringsIntroduction {
    public void Solution(){
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();

        System.out.println(A.length() + B.length());
        System.out.println(A.compareTo(B) >0?"Yes" : "No");

//        if (A.length() < B.length()){
////            System.out.println("Yes");
////        }else if (B.length() > A.length()) {
////            System.out.println("No");
////        }else{
////            System.out.println("No");
////        }

        System.out.println(A.substring(0,1).toUpperCase()+A.substring(1,A.length())+" "+
                           B.substring(0,1).toUpperCase()+B.substring(1,B.length()));


    }

    public static void main(String[] args) {
        JavaStringsIntroduction javastring = new JavaStringsIntroduction();
        javastring.Solution();
    }
}
