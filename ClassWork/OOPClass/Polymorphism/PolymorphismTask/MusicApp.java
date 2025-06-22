abstract class Instrument {
    abstract void playSound();
}

class Piano extends Instrument {
    @Override
    void playSound() {
        System.out.println("Piano is playing: Plink plonk...");
    }
}

class Guitar extends Instrument {
    @Override
    void playSound() {
        System.out.println("Guitar is playing: Strum strum...");
    }
}

class Violin extends Instrument {
    @Override
    void playSound() {
        System.out.println("Violin is playing: Screech screech...");
    }
}

public class MusicApp {
    public static void main(String[] args) {
        Instrument[] instruments = {
            new Piano(),
            new Guitar(),
            new Violin()
        };

        for (Instrument instrument : instruments) {
            System.out.println("Now playing: " + instrument.getClass().getSimpleName());
            instrument.playSound();
            System.out.println("-----");
        }
    }
}
