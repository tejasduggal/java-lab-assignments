public class GameCharacter {

    String name;
    int health;

    public GameCharacter(String name, int health) {
        this.name = name;
        this.health = health;
    }

    // Generic attack method
    public void attack(GameCharacter target) {
        System.out.println("The character attacks.");
    }
}
