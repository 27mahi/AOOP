package Banking;

public class User {
    private static User instance;
    private boolean loggedIn;
    private String userName;

    private User() {}

    public static User getInstance() {
        if (instance == null) {
            instance = new User();
        }
        return instance;
    }

    public void login(String userName) {
        this.userName = userName;
        this.loggedIn = true;
        System.out.println(userName + " logged in.");
    }

    public void logout() {
        userName = null;
        loggedIn = false;
        System.out.println("User logged out.");
    }

    public boolean isLoggedIn() {
        return loggedIn;
    }

    public String getUserName() {
        return userName;
    }
}

