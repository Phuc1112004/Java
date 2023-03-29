package com.class4;

import java.util.Scanner;

public class Triangle extends Shape {
    private float a;
    private float b;
    private float c;


    @Override
    public void inputData(){
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap do dai canh a: ");
        this.a = input.nextInt();
        System.out.print("Nhap do dai canh b: ");
        this.b = input.nextInt();
        System.out.print("Nhap do dai canh c: ");
        this.c = input.nextInt();
    }

    public void getArea() {
        double p = (a + b + c) / 2;
        double area = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        System.out.printf("Dien tich hinh tam giac = %.1f%n", area);
    }

}

