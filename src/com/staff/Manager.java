package com.staff;

import java.util.Scanner;

public class Manager extends Staff{
    String Department ;
    Manager(){
        super();
        this.Department="";
    }
    Manager(String name, String email,int salary, String department){
        super(name, email, salary);
        this.Department= department ;
    }

    public void inputData(){
        Scanner input = new Scanner(System.in);
        super.inputData();
        System.out.print("Enter Department: ");
        this.Department = input.nextLine();
    }
    public void displayData() {
        super.displayData();
        System.out.println("Department " + this.Department);
    }
}
