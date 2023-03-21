package com.student;

public class MainStudent {
    public static void main(String[] args) {

        //Create objects
        PersonStudent person1 = new PersonStudent();
        PersonStudent person2 = new PersonStudent();
        PersonStudent person3 = new PersonStudent();
        PersonStudent person4 = new PersonStudent();

        person1.inputData();
        person2.inputData();
        person3.inputData();
        person4.inputData();
        person1.display();
        person2.display();
        person3.display();
        person4.display();

//        Scanner input = new Scanner(System.in);
//        System.out.print("Please enter name: ");
//        String name = input.nextLine();
//
//        System.out.print("Please enter mark: ");
//        int mark = input.nextInt();
//
//        System.out.println("Hello " + name + ", your mark is = " + mark);

    }
}