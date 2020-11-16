package com.company;

public class User {
    // fields (attributes)
    public String name;
    public User(String name) {
        this.name = name;
    }
    // methods
    public void sayHi() {
        System.out.println("Hi there, my name is " + this.name);
    }
}
