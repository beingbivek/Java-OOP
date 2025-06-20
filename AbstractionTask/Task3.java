package AbstractionTask;

abstract class Vehicle{
    abstract void startEngine();
    abstract void stopEngine();
}

class Car extends Vehicle{

    @Override
    void startEngine() {
        System.out.println("Car Engine Starts");
    }

    @Override
    void stopEngine() {
        
        System.out.println("Car Engine Stops");
    }

}

class Motorcycle extends Vehicle{

    @Override
    void startEngine() {
         
        System.out.println("Motorcycle Engine Starts");
    }

    @Override
    void stopEngine() {
         
        System.out.println("Motorcycle Engine Stops");
    }

}

public class Task3 {
    public static void main(String[] args) {
        Car car = new Car();
        car.startEngine();
        Motorcycle motorcycle = new Motorcycle();
        motorcycle.startEngine();
        car.stopEngine();
        motorcycle.stopEngine();
    }
}
