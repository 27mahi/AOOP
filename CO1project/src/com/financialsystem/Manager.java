package com.financialsystem;

public class Manager extends Approver {
    @Override
    public void handleRequest(Transaction transaction) {
        if (transaction.getAmount() < 1000) {
            System.out.println("Manager approved transaction of " + transaction.getAmount());
        } else if (nextApprover != null) {
            nextApprover.handleRequest(transaction);
        }
    }
}
