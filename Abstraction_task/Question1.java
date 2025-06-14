//1. Create an abstract class called Bird with an abstract method called fly(). 
//Implement two subclasses called Eagle and Penguin that inherit from Bird. 
//Override the fly() method in both subclasses, 
//ensuring Eagle can fly while Penguin cannot. 
//Implement the Java code for this scenario.

abstract class Bird {
    public abstract void fly();
}

class Eagle extends Bird {
    @Override
    public void fly() {
        System.out.println("Eagle is flying high in the sky.");
    }
}

class Penguin extends Bird {
    @Override
    public void fly() {
        System.out.println("Penguin cannot fly.");
    }
}

public class Question1 {
    public static void main(String[] args) {
        Bird eagle = new Eagle();
        Bird penguin = new Penguin();
        
        eagle.fly();
        penguin.fly();
    }
}