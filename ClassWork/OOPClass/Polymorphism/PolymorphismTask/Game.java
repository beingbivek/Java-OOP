class Character {
    protected String name;

    Character(String name) {
        this.name = name;
    }

    public void attack() {
        System.out.println(name + " performs a basic attack.");
    }
}

class Warrior extends Character {

    Warrior(String name) {
        super(name);
    }

    @Override
    public void attack() {
        System.out.println(name + " swings a mighty sword!");
    }
}

class Mage extends Character {

    Mage(String name) {
        super(name);
    }

    @Override
    public void attack() {
        System.out.println(name + " casts a powerful fireball!");
    }
}

public class Game {
    public static void main(String[] args) {
        Character generic = new Character("Adventurer");
        Warrior warrior = new Warrior("Thorin");
        Mage mage = new Mage("Gandalf");

        generic.attack();
        warrior.attack();
        mage.attack();
    }
}
