package NewJavaTask.Encapsulation;

public class Car {
    private final String make;
    private final String model;
    private double rentalPricePerDay;
    private boolean isAvailable = true;

    // constructor to set make, model, and price
    public Car(String carMake, String carModel, double pricePerDay) {
        make = carMake;
        model = carModel;
        rentalPricePerDay = pricePerDay;
    }

    // getter methods
    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public double getRentalPricePerDay() {
        return rentalPricePerDay;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    // setter for price
    public void setRentalPricePerDay(double price) {
        if (price >= 0) {
            rentalPricePerDay = price;
        }
    }

    // method to rent the car
    public boolean rentCar() {
        if (isAvailable) {
            isAvailable = false;
            return true;
        }
        return false;
    }

    // method to return the car
    public void returnCar() {
        isAvailable = true;
    }

    public static void main(String[] args) {
        Car rentalCar = new Car("Toyota", "Corolla", 2500);

        System.out.println("Car: " + rentalCar.getMake() + " " + rentalCar.getModel());
        System.out.println("Price per day: " + rentalCar.getRentalPricePerDay());

        if (rentalCar.rentCar()) {
            System.out.println("Car rented successfully.");
        } else {
            System.out.println("Car is not available.");
        }

        rentalCar.returnCar();
        System.out.println("Car returned. Available again: " + rentalCar.isAvailable());
    }
}
