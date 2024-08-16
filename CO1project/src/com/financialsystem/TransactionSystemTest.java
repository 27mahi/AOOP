package com.financialsystem;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class TransactionSystemTest {

    private Account account1;
    private Account account2;
    private Approver manager;
    private Approver director;
    private Approver ceo;

    @BeforeEach
    public void setUp() {
        account1 = new Account("Account 1", 5000);
        account2 = new Account("Account 2", 3000);

        ceo = new CEO();
        director = new Director();
        director.setNextApprover(ceo);
        manager = new Manager();
        manager.setNextApprover(director);
    }

    @Test
    public void testManagerApproval() {
        Transaction transaction = new Transaction(500);
        manager.handleRequest(transaction);
        // Expected output: Manager approved transaction of 500
    }

    @Test
    public void testDirectorApproval() {
        Transaction transaction = new Transaction(5000);
        manager.handleRequest(transaction);
        // Expected output: Director approved transaction of 5000
    }

    @Test
    public void testCEOApproval() {
        Transaction transaction = new Transaction(15000);
        manager.handleRequest(transaction);
        // Expected output: CEO approved transaction of 15000
    }

    @Test
    public void testDeposit() {
        Deposit deposit = new Deposit(account1, 1000);
        deposit.execute();
        assertEquals(6000, account1.getBalance());
    }

    @Test
    public void testWithdraw() {
        Withdraw withdraw = new Withdraw(account1, 2000);
        withdraw.execute();
        assertEquals(3000, account1.getBalance());
    }

    @Test
    public void testTransfer() {
        Transfer transfer = new Transfer(account1, account2, 2000);
        transfer.execute();
        assertEquals(3000, account1.getBalance());
        assertEquals(5000, account2.getBalance());
    }

    @Test
    public void testTransactionIterator() {
        List<Transaction> transactions = Arrays.asList(new Transaction(500), new Transaction(2000), new Transaction(15000));
        TransactionIterator iterator = new TransactionIterator(transactions);

        int count = 0;
        while (iterator.hasNext()) {
            Transaction transaction = iterator.next();
            assertNotNull(transaction);
            count++;
        }
        assertEquals(3, count);
    }
}
