package com.company;

public class Main {

    public static void main(String[] args) {
//        User user = new User("Sodium", 30);
//        user.sayHi();
        TaxCalculator calculator = getTaxCalculator();
        calculator.calculateTax();
    }
    public static TaxCalculator getTaxCalculator() {
        return new TaxCalculator2020();
    }
}
