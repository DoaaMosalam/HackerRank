package com.company;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class JavaSubstring {
    public void solution() {

        Scanner in = new Scanner(System.in);
        String S = in.next();
        int start = in.nextInt();
        int end = in.nextInt();
        System.out.println(S.substring(start,end));
    }
}
