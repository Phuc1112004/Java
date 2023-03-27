package com.staff;

import java.util.Scanner;

public class Staff {
    protected String name;
    protected String email;
    int salary;

    Staff(){
        this.name = "";
        this.email = "";
        this.salary=0;
    }

    Staff(String name,String email, int salary){
        this.name= name;
        this.email= email;
        this.salary= salary;
    }


    public void displayData(){
        System.out.println("Name: "+ this.name);
        System.out.println("Email: "+ this.email);
        System.out.println("Salary: "+ this.salary+"$");
    }
    public void inputData(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Name:");
        this.name = input.nextLine();
        System.out.println("Enter Email:");
        this.email = input.nextLine();
        System.out.println("Enter Salary:");
        this.salary = input.nextInt();

    }

    public int getSalary(){
        return salary;
    }
}


