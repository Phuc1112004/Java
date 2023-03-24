package com.MainClass3;

import com.class3.StudentWallet;

public class MainClassObject {
    public static void main(String[] args) {
        //Student stu = new Student("A12345", "Tuan", 21);
        StudentWallet newStudent = new StudentWallet();
        newStudent.inputData();
        newStudent.display();

        //deposit money to Student
        newStudent.deposit();
    }
}
