package com.staff;

import java.util.Scanner;

public class MainStaff {
    public static void main(String[] args) {

        System.out.println("===== Welcome to our company =====");
        System.out.println("1. Create a new director");
        System.out.println("2. Create a new manager");
        System.out.println("3. Create a new employee");
        System.out.println("4. Exit");

        while (true) {
            System.out.print("Please select a menu (1 - 4): ");

            Scanner mainScanner = new Scanner(System.in);
            int selectedMenu = Integer.parseInt(mainScanner.nextLine());

            switch (selectedMenu) {
                case 1 -> {
                    System.out.println("Instantiating a new director....");
                    Director director = new Director();
                    director.inputData();
                    director.displayData();
                }
                case 2 -> {
                    System.out.println("Instantiating a new manager....");
                    Manager manager = new Manager();
                    manager.inputData();
                    manager.displayData();
                }
                case 3 -> {
                    System.out.println("Instantiating a new employee....");
                    Employee employee = new Employee();
                    employee.inputData();
                    employee.displayData();
                }
                case 4 -> {
                    return;
                }
            }
        }
    }
}
