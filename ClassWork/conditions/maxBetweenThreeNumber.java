package ClassWork.conditions;

import java.util.Scanner;

public class maxBetweenThreeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number: ");
        int first = sc.nextInt();
        System.out.println("Enter second Number: ");
        int second = sc.nextInt();
        System.out.println("Enter third Number: ");
        int third = sc.nextInt();
        sc.close();
        if (first > second) {
            if (first > third) {
                System.out.println("First is max.");
            }
        } else {
            if(second > third){
                System.out.println("Second is max.");
            } else {
                System.out.println("Third is max.");
            }
        }
    }
}
