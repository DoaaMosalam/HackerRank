package com.company.ThirtyDaysOfCode.LetsReview;

import com.company.LetsReview.LetsReview;

import java.util.Scanner;
/*Task
Given a string, , of length  that is indexed from  to , print its even-indexed and odd-indexed characters as  space-separated strings on a single line (see the Sample below for more detail).

Note:  is considered to be an even index.

Example
Print abc def

Input Format

The first line contains an integer,  (the number of test cases).
Each line  of the  subsequent lines contain a string, .

Constraints

Output Format

For each String  (where ), print 's even-indexed characters, followed by a space, followed by 's odd-indexed characters.

Sample Input

2
Hacker
Rank
Sample Output

Hce akr
Rn ak*/
public class Let_sReview {
    public static void main(String[] args) {
        LetsReview review = new LetsReview();
        review.Solution();

    }

    public void solution(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number: ");
        int n = input.nextInt();
        input.nextLine();
        for (int i =0; i<n;i++){
            System.out.println("Enter words: ");

            String s = input.nextLine();
            for (int j=0;j<s.length();j++){
                String even="",odd="";
                if (j%2==0){
                    even+=s.substring(j,j+1);
                }else {
                    odd+=s.substring(j,j+1);
                }
                System.out.println(even + " " +odd);
            }
        }
        input.close();

    }
}
