package Game;

public class Main {
    public static void main(String[] args) {
        State gameState = State.getInstance();
        gameState.setLevel("1");
        gameState.setDifficulty("Easy");
        gameState.displayState();

        EFactory enemyFactory = new EFactory();
        Enemy enemy = enemyFactory.createEnemy("goblin");
        enemy.attack();

        GFactory gameFactory = new GFactory();
        Weapon weapon = gameFactory.createWeapon("sword");
        weapon.use();
        PowerUp powerUp = gameFactory.createPowerUp("healthpotion");
        powerUp.activate();
    }
}
