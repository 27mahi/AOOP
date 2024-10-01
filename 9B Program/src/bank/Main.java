package bank;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        BankAccount sharedAccount = new BankAccount(1000);

        // Creating a pool of 5 threads simulating multiple users
        ExecutorService executor = Executors.newFixedThreadPool(5);

        // Simulating multiple deposit and withdrawal operations
        executor.submit(new BankUser(sharedAccount, true, 200));  // Deposit $200
        executor.submit(new BankUser(sharedAccount, false, 300)); // Withdraw $300
        executor.submit(new BankUser(sharedAccount, true, 150));  // Deposit $150
        executor.submit(new BankUser(sharedAccount, false, 1000)); // Withdraw $1000 (should fail)
        executor.submit(new BankUser(sharedAccount, true, 500));  // Deposit $500

        executor.shutdown();
    }
}
