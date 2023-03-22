package com.demo;

import java.util.Scanner;

public class SumDigit {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter n: ");

        int n= input.nextInt();
        int sum=0;

        for(int i=n;i > 0;i /=10){
            sum += i % 10;
        }
        System.out.println("Sum digit =" + sum);
    }
}
