package com.wallet;

public class Wallet {
    int ammout;

    Wallet() {
        this.ammout = 0;
    }

    public void deposit(int money) {
        this.ammout += money;
    }

    public boolean payMoney(int money) {
        if(money <= this.ammout) {
            this.ammout -= money;
            return true;
        }

        return false;
    }
}
