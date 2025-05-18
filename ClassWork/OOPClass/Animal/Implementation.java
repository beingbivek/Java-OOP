package ClassWork.OOPClass.Animal;

import java.util.Scanner;

public class Implementation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Dog[] dogObjectList = new Dog[5];
        String name, color;
        int age;

        for (int i = 0; i < 5; i++) {
            
            System.out.println("Enter " + (i+1) + " Dog Name:");
            name = sc.nextLine();
            System.out.println("Enter " + (i+1) + " Dog Age:");
            age = sc.nextInt();
            System.out.println("Enter " + (i+1) + " Dog Color:");
            color = sc.next();
            sc.nextLine();
            // Instantiate the Dog object
            dogObjectList[i] = new Dog();
            dogObjectList[i].name = name;
            dogObjectList[i].age = age;
            dogObjectList[i].color = color;
        }

        for (int i = 0; i < 5; i++) {
            dogObjectList[i].printDetails();
        }
        sc.close();
    }
}
