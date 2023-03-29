package com.class4;

import java.util.Scanner;

public class Rectangle extends Shape{
    private int a;
    private int b;

    public void inputData() {
        System.out.println("Dang khoi tao hinh chu nhat.....");
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap chieu dai: ");
        this.a = input.nextInt();
        System.out.println("Nhap chieu rong: ");
        this.b = input.nextInt();
    }

    public void getArea() {
        double area = a * b;
        System.out.printf("Dien tich hinh chu nhat = %.1f%n", area);
    }
}
