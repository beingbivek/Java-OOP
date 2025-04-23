package JavaTask;

import java.util.Scanner;

public class NameWithGreeting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your full name: ");
        String name = input.nextLine();
        System.out.println("Hello, "+name+". Welcome to my program!");
        input.close();
    }
}
