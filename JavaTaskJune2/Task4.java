package JavaTaskJune2;

class Vehicle{
    public void startEngine(){
        System.out.println("Vehicle Engine Starts!");
    }
    public void stopEngine(){
        System.out.println("Vehicle Engine Stops!");
    }
}

class Car extends Vehicle{
    public void drive(){
        System.out.println("Car Drives!");
    }
}

class Motorcycle extends Vehicle{
    public void ride(){
        System.out.println("Motorcycle Rides!");
    }
}

public class Task4 {
    public static void main(String[] args) {
        Car car = new Car();
        car.startEngine();
        car.drive();
        car.stopEngine();

        Motorcycle motorcycle = new Motorcycle();
        motorcycle.startEngine();
        motorcycle.ride();
        motorcycle.stopEngine();
    }
}
