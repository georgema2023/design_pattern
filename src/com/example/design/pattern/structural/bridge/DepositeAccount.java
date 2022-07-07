package com.example.design.pattern.structural.bridge;

public class DepositeAccount implements Account {
    @Override
    public Account openAccount() {
    System.out.println("open deposite account");
    return new DepositeAccount();
    }

    @Override
    public void showAccountType() {
    System.out.println("deposite account");
    }
}
