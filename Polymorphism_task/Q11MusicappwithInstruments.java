// 11. You are designing a music application where different musical instruments, 
// such as Piano, Guitar, and Violin, have unique ways of producing sound. 
// Implement a Java program using polymorphism where each instrument has a 
// playSound() method that behaves differently for each type of instrument.

interface Instrument {
    void playSound();
}

class Piano implements Instrument {
    @Override
    public void playSound() {
        System.out.println("Piano sound: Plink plink plink");
    }
}

class Guitar implements Instrument {
    @Override
    public void playSound() {
        System.out.println("Guitar sound: Strum strum strum");
    }
}

class Violin implements Instrument {
    @Override
    public void playSound() {
        System.out.println("Violin sound: Squeak squeak... beautiful melody");
    }
}

public class Q11MusicappwithInstruments {
    public static void main(String[] args) {
        Instrument[] orchestra = {
            new Piano(),
            new Guitar(),
            new Violin()
        };
        
        for (Instrument instrument : orchestra) {
            instrument.playSound();
        }
    }
}