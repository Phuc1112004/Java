package com.staff;

import java.util.Scanner;

public class Director extends Staff{
    String Role;
//    Director(){
//        super();
//        this.Role="";
//    }
//    Director(String name, String email,int salary, String role){
//        super(name, email, salary);
//        this.Role= role ;
//    }

    @Override
    public int getBonus() {
        return 5 * this.salary;
    }
    @Override
    public void displayData() {

        System.out.println("This is an Director");
        System.out.println("Roll: "+ this.Role);
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

        System.out.print("Enter Role: ");
        this.Role = input.nextLine();
    }


}
