package Banking;

public class OperationsforBanking {
    public void viewBalance() {
        if (User.getInstance().isLoggedIn()) {
            System.out.println(User.getInstance().getUserName() + ", your balance is $1000.");
        } else {
            System.out.println("Please log in to view your balance.");
        }
    }

    public void deposit() {
        if (User.getInstance().isLoggedIn()) {
            System.out.println(User.getInstance().getUserName() + ", you deposited $500.");
        } else {
            System.out.println("Please log in to deposit.");
        }
    }

    public void withdraw() {
        if (User.getInstance().isLoggedIn()) {
            System.out.println(User.getInstance().getUserName() + ", you withdrew $200.");
        } else {
            System.out.println("Please log in to withdraw.");
        }
    }
}

