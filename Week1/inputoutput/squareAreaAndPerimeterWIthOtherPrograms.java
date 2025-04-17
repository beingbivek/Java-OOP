import java.util.Scanner;
import simpleInterest;

public class squareAreaAndPerimeterWIthOtherPrograms {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float height,width,length;
        double answer;
        System.out.println("Welcome, choose any number to perform a task!");
        System.out.println("1. Area and Perimeter of Square.");
        System.out.println("2. Area of triangle.");
        System.out.println("3. Volume of Cuboid.");
        System.out.println("4. Volume of Cube.");
        System.out.println("5. Simple Interest.");
        int choice = sc.nextInt();
        System.out.println("Now you need to enter some measurements");
        if (choice == 1) {
            System.out.println("Enter side: ");
            height = sc.nextFloat();
            answer = height * height;
            System.out.print("Area of square is: " + answer);
            answer = 4 * height;
            System.out.print(" and the Perimeter of square is: " + answer);  

        } else if (choice == 2){
            System.out.println("Enter height: ");
            height = sc.nextFloat();
            System.out.println("Enter base: ");
            width = sc.nextFloat();
            answer = 0.5 * height * width;
            System.out.println("Area of triangle is: " + answer);

        } else if (choice == 3){
            System.out.println("Enter height: ");
            height = sc.nextFloat();
            System.out.println("Enter width: ");
            width = sc.nextFloat();
            System.out.println("Enter length: ");
            length = sc.nextFloat();
            answer =  length * height * width;
            System.out.println("Area of cuboid is: " + answer);

        } else if (choice == 4){
            System.out.println("Enter side: ");
            height = sc.nextFloat();
            answer = height * height * height;
            System.out.println("Area of cube is: " + answer);
        } else if (choice == 5){
            System.out.println("Enter Principle Amount: ");
            int principleamt = sc.nextInt();
            System.out.println("Enter time (in years): ");
            float time = sc.nextFloat();
            System.out.println("Enter Rate: ");
            float rate = sc.nextFloat();
            double SI = (principleamt * time * rate) / 100;
            System.out.print("The Simple Interest is:" + SI);
        } else {
            System.out.println("Incorrect Value.");
        }
        sc.close();
    }
}
