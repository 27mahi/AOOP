package com.financialsystem;

public class Director extends Approver {
    @Override
    public void handleRequest(Transaction transaction) {
        if (transaction.getAmount() < 10000) {
            System.out.println("Director approved transaction of " + transaction.getAmount());
        } else if (nextApprover != null) {
            nextApprover.handleRequest(transaction);
        }
    }
}
