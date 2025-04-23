package JavaTask;

import java.util.Scanner;

public class ADMD {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("Enter First number: ");
        int a = input.nextInt();
        System.out.println("Enter Second number: ");
        int b = input.nextInt();
        System.out.println("Sum of " + a + " and " + b + " is " + (a+b));
        System.out.println("Difference of " + a + " and " + b + " is " + (a-b));
        System.out.println("Product of " + a + " and " + b + " is " + (a*b));
        System.out.println("Quotient of " + a + " and " + b + " is " + (a/b));
        input.close();
    }

}
