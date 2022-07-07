package com.example.design.pattern.structural.bridge;

public class BBank extends Bank {
    public BBank(Account account) {
        super(account);
    }

    @Override
    Account openAccount() {
    System.out.println("open BBank account");
        return account;
    }
}
