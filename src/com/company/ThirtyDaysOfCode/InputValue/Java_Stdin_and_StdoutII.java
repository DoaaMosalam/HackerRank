package com.company.ThirtyDaysOfCode.InputValue;

import java.util.Scanner;

public class Java_Stdin_and_StdoutII {
    /**
     * On the first line, print String: followed by the unaltered String read from stdin.
     * On the second line, print Double: followed by the unaltered double read from stdin.
     * On the third line, print Int: followed by the unaltered integer read from stdin.
     */
    public void StdinandStdoutII() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input User is : ");
        int i = scan.nextInt();
        double d = scan.nextDouble();
        // scan.nextLine();
        String s = scan.next();
        s += scan.nextLine();

        System.out.println("String:\t " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
    public static void main(String[] args) {
        Java_Stdin_and_StdoutII sas11 = new Java_Stdin_and_StdoutII();
//        sas11.StdinandStdoutII();
    }

}
