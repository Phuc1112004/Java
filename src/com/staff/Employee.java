package com.staff;

import java.util.Scanner;

public class Employee extends Staff{
    String Skill ;
    Employee(){
        super();
        this.Skill="";
    }
    Employee(String name, String email, int salary, String skill){
        super(name, email, salary);
        this.Skill= skill ;
    }

    public void inputData(){
        Scanner input = new Scanner(System.in);
        super.inputData();
        System.out.print("Enter Skill: ");
        this.Skill = input.nextLine();
    }
    public void displayData() {
        super.displayData();
        System.out.println("Skill " + this.Skill);
    }
}
