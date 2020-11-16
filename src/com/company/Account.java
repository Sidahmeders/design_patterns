package com.company;

public class Account {
    private float balance;

    public void setBalance(float balance) {
        if (balance > 1) {
            this.balance = balance;
        }
    }
}
