package com.wallet;

import java.util.Scanner;

public class Person {
    Wallet wallet;

    //Default Constructor
    Person() {
        this.wallet = new Wallet();
    }

    //   public int money ;
//
//
//
    public void inputData() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your money ");

        int money = scanner.nextInt();
        this.wallet.deposit( money );
        System.out.println("Deposit $" + money);
    }

    public int calcTotal (int[] bills)
    {
        int sum = 0;
        for (int i = 0; i < bills.length; i++) {
            sum += bills[i];
        }
        return sum;
    }

    public boolean payMoney(int total) { //600
        return this.wallet.payMoney(total);
    }
}
