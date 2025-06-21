// 10. You are developing a game in Java. The game has a base class Character with a method attack()
// that displays the basic attack action of the character. Now, you need to create two derived classes 
// Warrior and Mage that inherit from Character and override the attack() method to display their specific attack actions.
// Write the code to demonstrate method overriding for character attacks in the game.

class Character {
    void attack() {
        System.out.println("Basic attack!");
    }
}

class Warrior extends Character {
    @Override
    void attack() {
        System.out.println("Warrior swings a mighty sword!");
    }
}

class Mage extends Character {
    @Override
    void attack() {
        System.out.println("Mage casts a powerful spell!");
    }
}

public class Q10GameCharacterAttacks {
    public static void main(String[] args) {
        Character[] characters = {
            new Character(),
            new Warrior(),
            new Mage()
        };
        
        for (Character character : characters) {
            character.attack();
        }
    }
}