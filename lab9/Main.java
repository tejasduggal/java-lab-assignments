public class Main {
    public static void main(String[] args) {

        GameCharacter warrior = new Warrior("Thor", 120, 15);
        GameCharacter wizard = new Wizard("Merlin", 80, 20);

        // Dynamic Polymorphism: parent reference → child object
        warrior.attack(wizard);
        wizard.attack(warrior);
    }
}
