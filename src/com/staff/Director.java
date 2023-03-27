package com.staff;

import java.util.Scanner;

public class Director extends Staff{
    String Roll;
    Director(){
        super();
        this.Roll="";
    }
    Director(String name, String email,int salary, String roll){
        super(name, email, salary);
        this.Roll= roll ;
    }

    public void displayData() {
        super.displayData();
        System.out.println("Roll: "+ this.Roll);
    }
    public void inputData(){
        Scanner input = new Scanner(System.in);
        super.inputData();
        System.out.print("Enter Roll: ");
        this.Roll = input.nextLine();
    }


}
