package com.financialsystem;

public class Transfer implements TransactionCommand {
    private Account fromAccount;
    private Account toAccount;
    private double amount;

    public Transfer(Account fromAccount, Account toAccount, double amount) {
        this.fromAccount = fromAccount;
        this.toAccount = toAccount;
        this.amount = amount;
    }

    @Override
    public void execute() {
        fromAccount.transfer(toAccount, amount);
        System.out.println("Transferred " + amount + " from " + fromAccount.getName() +
                " to " + toAccount.getName());
    }
}
