package bank;

public class BankUser implements Runnable {
    private final BankAccount account;
    private final boolean deposit;
    private final double amount;

    public BankUser(BankAccount account, boolean deposit, double amount) {
        this.account = account;
        this.deposit = deposit;
        this.amount = amount;
    }

    @Override
    public void run() {
        if (deposit) {
            account.deposit(amount);
        } else {
            account.withdraw(amount);
        }
    }
}
