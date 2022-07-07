package com.example.design.pattern.structural.bridge;

public class Test {
  public static void main(String[] args) {
    Bank aBank = new ABank(new DepositeAccount());
    Account aAccount = aBank.openAccount();
    aAccount.showAccountType();

    Bank bBank = new BBank(new SavingAccount());
    Account bAccount = bBank.openAccount();
    bAccount.showAccountType();
  }
}
