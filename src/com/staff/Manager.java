package com.staff;

import java.util.Scanner;

public class Manager extends Staff{
    String Department ;
//    Manager(){
//        super();
//        this.Department="";
//    }
//    Manager(String name, String email,int salary, String department){
//        super(name, email, salary);
//        this.Department= department ;
//    }

    @Override
    public int getBonus() {
        return 3 * this.salary;
    }
    @Override
    public void inputData(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Name:");
        this.name = input.nextLine();
        System.out.println("Enter Email:");
        this.email = input.nextLine();
        System.out.println("Enter Salary:");
        this.salary = input.nextInt();

        System.out.print("Enter Department: ");
        this.Department = input.nextLine();
    }

    @Override
    public void displayData() {
        System.out.println("Name: "+ this.name);
        System.out.println("Email: "+ this.email);
        System.out.println("Salary: "+ this.salary+"$");

        System.out.println("Department " + this.Department);
    }
}
