package com.company.DataTypes;


import java.util.Scanner;

public class DataTypes {
    public void AddOperator(){
         int i=4;
         double d=4.0;
         String s;
        System.out.println("Enter integer number: ");
        Scanner input = new Scanner(System.in);
        int intNum = input.nextInt() + i;
        System.out.println("Enter double number: ");
        Double doubleNum = input.nextDouble() + d;
        System.out.println("Enter your String: ");
        s = input.next();
        s += input.nextLine();
        System.out.println(intNum);
        System.out.println(doubleNum);
        System.out.println("HackerRank "+ s);

    }

    public static void main(String[] args) {
        DataTypes dataTypes = new DataTypes();
        dataTypes.AddOperator();

    }


}




