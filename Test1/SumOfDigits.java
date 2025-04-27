package Test1;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = sc.nextInt();
        int sum = 0;
        sc.close();
        while (number != 0){
            sum += number % 10;
            number = number / 10;
        }
        System.out.println("The sum is : "+sum);
    }
}
