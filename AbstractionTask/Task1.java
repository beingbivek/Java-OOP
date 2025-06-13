package AbstractionTask;

abstract class Bird{
    abstract void fly();
}

class Eagle extends Bird{

    @Override
    void fly() {
        System.out.println("Eagle can fly!");
    }

}

class Penguin extends Bird{

    @Override
    void fly() {
        System.out.println("Penguin cannot fly!");
    }

}

public class Task1 {
    public static void main(String[] args) {
        Eagle eagle = new Eagle();
        eagle.fly();
        Penguin pg = new Penguin();
        pg.fly();
    }
}
