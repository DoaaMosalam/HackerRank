package com.company.ReverseArray;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Array array = new Array();
        array.solution();
    }

    public void solution(){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i=0; i < n; i++){
            arr[i] = in.nextInt();
        }
        in.close();

        for (int i = 0; i < n; i++) {
            System.out.print(arr[(n - 1) - i] + " ");
        }
    }
}
