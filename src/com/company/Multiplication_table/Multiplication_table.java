package com.company.Multiplication_table;

import java.util.Scanner;

public class  Multiplication_table {

    public static void solution() {
        System.out.println("Write Number : ");
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
//        for (int i = 1; i <= 10; i++) {
//            System.out.println(N + " x " + i + " = " + i * N);
//        }
//        for (int i = 1; i <= 10; i++) {
//            for (int j = 1; j <= 10; j++) {
//                System.out.println(i + "*" + j + "=" + (i * j));
//            }
//            System.out.println("-------------------------------------------------------------------");

    //    }
        //int num = 0;
        for(int i = 1; i <= 10; ++i)
        {
            System.out.printf("%d * %d = %d \n", N, i, N * i);
        }

//----------------------------------------------------
//       Scanner scanner = new Scanner(System.in);
//        System.out.println("Write your number to division: ");
//        int a = scanner.nextInt();
//        for (int b=1;b<=10;b++){
//            System.out.println("The division is:" +  a + " % " + b + "= " + a/(double) b);
//        }


//        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
//
//        scanner.close();
//
        }

    public static void main(String[] args) {
          Multiplication_table mt = new Multiplication_table();
        Multiplication_table.solution();
    }

}
