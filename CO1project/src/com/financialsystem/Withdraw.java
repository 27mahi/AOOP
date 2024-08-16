package com.financialsystem;

public class Withdraw implements TransactionCommand {
    private Account account;
    private double amount;

    public Withdraw(Account account, double amount) {
        this.account = account;
        this.amount = amount;
    }

    @Override
    public void execute() {
        account.withdraw(amount);
        System.out.println("Withdrew " + amount + ". New balance: " + account.getBalance());
    }
}
