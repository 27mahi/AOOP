package com.financialsystem;

import java.util.Iterator;
import java.util.List;

public class TransactionIterator implements Iterator<Transaction> {
    private List<Transaction> transactions;
    private int index = 0;

    public TransactionIterator(List<Transaction> transactions) {
        this.transactions = transactions;
    }

    @Override
    public boolean hasNext() {
        return index < transactions.size();
    }

    @Override
    public Transaction next() {
        return transactions.get(index++);
    }
}
