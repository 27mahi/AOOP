package Banking;

public class Main {
    public static void main(String[] args) {
        User session = User.getInstance();
        OperationsforBanking operations = new OperationsforBanking();

        session.login("Alice");

        operations.viewBalance();
        operations.deposit();
        operations.withdraw();

        session.logout();
    }
}

