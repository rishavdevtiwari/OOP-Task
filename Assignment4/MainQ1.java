// 1. Develop a Java program that demonstrates multi-level inheritance:
// ● Create a base class Animal with method makeSound().
// ● Create a subclass Mammal and another subclass Dog that overrides the method.
// ● In the main method, show how overriding works.


class Animal {
    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Mammal extends Animal {
    @Override
    void makeSound() {
        System.out.println("Mammal makes a sound");
    }
}

class Dog extends Mammal {
    @Override
    void makeSound() {
        System.out.println("Dog barks!");
    }
}

public class MainQ1 {
    public static void main(String[] args) {
        Animal a = new Dog();
        a.makeSound(); 
    }
}