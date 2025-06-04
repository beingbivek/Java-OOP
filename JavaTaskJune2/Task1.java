package JavaTaskJune2;

class Vehicle{
    public void drive(){
        System.out.println("Vehicle Drive");
    }

}

class Car extends Vehicle{
    public void display(){
        System.out.println("Hyundai i20 asta, 2015 Model, 1.2L Petrol Engine");
    }
}
public class Task1 {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.display();
    }
}
