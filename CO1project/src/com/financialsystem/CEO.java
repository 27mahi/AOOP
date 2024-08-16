package com.financialsystem;

public class CEO extends Approver {
    @Override
    public void handleRequest(Transaction transaction) {
        System.out.println("CEO approved transaction of " + transaction.getAmount());
    }
}
