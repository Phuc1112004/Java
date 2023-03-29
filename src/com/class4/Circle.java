package com.class4;

import java.util.Scanner;

public class Circle extends Shape{
    private int radius;

    public void inputData() {
        System.out.println("Dang khoi tao hinh tron.....");
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap ban kinh: ");
        this.radius = input.nextInt();
    }

    public void getArea() {
        double area = Math.PI * radius * radius;
        System.out.printf("Dien tich hinh tron = %.1f%n", area);
    }
}
