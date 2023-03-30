package com.class4;

import java.util.Scanner;

public class Rectangle extends Shape{
    private int d;
    private int e;

    public void inputData() {
        System.out.println("Dang khoi tao hinh chu nhat.....");
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap chieu dai: ");
        this.d = input.nextInt();
        System.out.println("Nhap chieu rong: ");
        this.e = input.nextInt();
    }

    public void getArea() {
        double area = d * e;
        System.out.printf("Dien tich hinh chu nhat = %.1f%n", area);
    }
}
