package gcr-codebase.polymorphisim;

// Superclass
class GameCharacter {

    String characterName;

    GameCharacter(String characterName) {
        this.characterName = characterName;
    }

    void performAttack() {
        System.out.println("Character attacks");
    }
}

// Subclass 1
class Warrior extends GameCharacter {

    Warrior(String characterName) {
        super(characterName);
    }

    void performAttack() {
        System.out.println(characterName + " attacks with Sword");
    }
}

// Subclass 2
class Mage extends GameCharacter {

    Mage(String characterName) {
        super(characterName);
    }

    void performAttack() {
        System.out.println(characterName + " attacks with Magic");
    }
}

// Subclass 3
class Archer extends GameCharacter {

    Archer(String characterName) {
        super(characterName);
    }

    void performAttack() {
        System.out.println(characterName + " attacks with Bow");
    }
}

public class Battle {

    // Method to start battle
    static void startBattle(GameCharacter[] characters) {

        int warrior = 0, mage = 0, archer = 0;

        for (GameCharacter c : characters) {

            // Dynamic Method Dispatch
            c.performAttack();

            if (c instanceof Warrior)
                warrior++;
            else if (c instanceof Mage)
                mage++;
            else if (c instanceof Archer)
                archer++;
        }

        System.out.println("\nWarriors : " + warrior);
        System.out.println("Mages : " + mage);
        System.out.println("Archers : " + archer);
    }

    public static void main(String[] args) {

        GameCharacter[] characters = {
            new Warrior("Arjun"),
            new Mage("Harry"),
            new Archer("Robin"),
            new Warrior("Leon")
        };

        startBattle(characters);
    }
}
