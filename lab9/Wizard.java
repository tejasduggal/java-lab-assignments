public class Wizard extends GameCharacter {

    int magicPower; // Magic damage factor

    public Wizard(String name, int health, int magicPower) {
        super(name, health);
        this.magicPower = magicPower;
    }

    @Override
    public void attack(GameCharacter target) {
        System.out.println(name + " casts a spell at " + target.name +
                ", dealing " + magicPower + " magic damage!");
    }
}
