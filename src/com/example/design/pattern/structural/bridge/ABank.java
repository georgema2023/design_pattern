package com.example.design.pattern.structural.bridge;

public class ABank extends Bank {
    public ABank(Account account) {
        super(account);
    }

    @Override
    Account openAccount() {
    System.out.println("open ABank account");
        return account;
    }
}
