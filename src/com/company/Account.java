package com.company;

public class Account {
    private float balance;

    public void deposit(float amount) {
        if (amount >= 1) {
            balance += amount;
        }
    }

    public void withdraw(float amount) {
        if (amount >= 1) {
            balance -= amount;
        }
    }

    public String getBalance() {
        return "your balance is: " + balance + "$";
    }
}
