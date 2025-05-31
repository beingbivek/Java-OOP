package NewJavaTask.OOP;

public class Dog {
    private String dogName;
    private String dogBreed;

    // constructor
    public Dog(String name, String breed) {
        dogName = name;
        dogBreed = breed;
    }

    // setter methods
    public void setDogName(String name) {
        dogName = name;
    }

    public void setDogBreed(String breed) {
        dogBreed = breed;
    }

    // getter methods
    public String getDogName() {
        return dogName;
    }

    public String getDogBreed() {
        return dogBreed;
    }

    public static void main(String[] args) {
        Dog dogOne = new Dog("Rocky", "Bulldog");
        Dog dogTwo = new Dog("Bella", "Poodle");

        // updating values using setters
        dogOne.setDogName("Max");
        dogTwo.setDogBreed("Golden Retriever");

        System.out.println("Dog 1: " + dogOne.getDogName() + " - " + dogOne.getDogBreed());
        System.out.println("Dog 2: " + dogTwo.getDogName() + " - " + dogTwo.getDogBreed());
    }
}

