package com.company.ThirtyDaysOfCode.Loop;

import java.util.Scanner;

public class JavaLoops11 {
    public static void main(String[] args) {
        JavaLoops11 javaloop = new JavaLoops11();
        javaloop.SolutionLopps2();
    }
    public void SolutionLopps2(){

        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int s=0;
//            s=s+a;
//            for(int x =0;x<n;x++){
//                s+=(Math.pow(2,x))*b;
//
//                System.out.print(" "+s);
//            }
//            int x=0;
//            for(int j=0,k=0;j<n && k<=n-1;j++,k++){
//                x=(int)Math.pow(2,k)*b + x;
//                System.out.print(a+x+" ");
//        }
        in.close();

    }
}

}
