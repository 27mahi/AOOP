package Game;

public class State {
    private static State instance;
    private String level;
    private String difficulty;

    private State() {}

    public static State getInstance() {
        if (instance == null) {
            instance = new State();
        }
        return instance;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public void setDifficulty(String difficulty) {
        this.difficulty = difficulty;
    }

    public void displayState() {
        System.out.println("Level: " + level + ", Difficulty: " + difficulty);
    }
}
