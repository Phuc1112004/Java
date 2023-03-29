package com.staff;

import java.util.Scanner;

public class Employee extends Staff{
    String Skill ;
//    Employee(){
//        super();
//        this.Skill="";
//    }
//    Employee(String name, String email, int salary, String skill){
//        super(name, email, salary);
//        this.Skill= skill ;
//    }

    @Override
    public int getBonus() {
        return 2 * this.salary;
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

        System.out.print("Enter Skill: ");
        this.Skill = input.nextLine();
    }

    @Override
    public void displayData() {
        System.out.println("Skill " + this.Skill);
    }
}
