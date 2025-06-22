abstract class Vehicle {
    abstract double calculateRentalCost(int hours);
}

class Car extends Vehicle {
    private double ratePerHour = 15.0;

    @Override
    double calculateRentalCost(int hours) {
        return ratePerHour * hours;
    }
}

class Motorcycle extends Vehicle {
    private double ratePerHour = 10.0;

    @Override
    double calculateRentalCost(int hours) {
        return ratePerHour * hours;
    }
}

class Bicycle extends Vehicle {
    private double ratePerHour = 5.0;

    @Override
    double calculateRentalCost(int hours) {
        return ratePerHour * hours;
    }
}

public class RentalSystem {
    public static void main(String[] args) {
        Vehicle[] vehicles = {
            new Car(),
            new Motorcycle(),
            new Bicycle()
        };

        int rentalHours = 4;

        for (Vehicle vehicle : vehicles) {
            System.out.println("Rental cost for " + vehicle.getClass().getSimpleName() +
                               " for " + rentalHours + " hours: $" +
                               vehicle.calculateRentalCost(rentalHours));
        }
    }
}
