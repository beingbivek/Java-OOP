package JavaTask;

import java.util.Scanner;

public class PositiveNegativeZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = sc.nextInt();
        sc.close();
        if (number < 0){
            System.out.println("Number is Negative");
        }else if (number>0){
            System.out.println("Number is Positive");
        } else {
            System.out.println("Number is Zero.");
        }
    }
}
