package ClassWork.Methods.ConversionOfWeek2TaskToMethod;

import java.util.Scanner;

public class TernaryOperatorVotingEligibility {
    static boolean isEligible(int age){
        return (age >= 18) ? true : false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = sc.nextInt();
        sc.close();
        if (isEligible(age)){
            System.out.println("You are eligible to vote.");
        }else{
            System.out.println("You are not eligible to vote.");
        }
    }
    
}
