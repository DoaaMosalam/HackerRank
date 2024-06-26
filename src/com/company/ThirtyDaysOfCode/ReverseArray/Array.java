package com.company.ThirtyDaysOfCode.ReverseArray;

import java.util.Scanner;
/*Task
Given an array, , of  integers, print 's elements in reverse order as a single line of space-separated numbers.

Example


Print 4 3 2 1. Each integer is separated by one space.

Input Format

The first line contains an integer,  (the size of our array).
The second line contains  space-separated integers that describe array 's elements.

Constraints

Constraints

, where  is the  integer in the array.
Output Format

Print the elements of array  in reverse order as a single line of space-separated numbers.

Sample Input

4
1 4 3 2
Sample Output

2 3 4 1*/
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
