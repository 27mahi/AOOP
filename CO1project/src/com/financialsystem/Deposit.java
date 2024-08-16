package com.financialsystem;

public class Deposit implements TransactionCommand {
    private Account account;
    private double amount;

    public Deposit(Account account, double amount) {
        this.account = account;
        this.amount = amount;
    }

    @Override
    public void execute() {
        account.deposit(amount);
        System.out.println("Deposited " + amount + ". New balance: " + account.getBalance());
    }
}
