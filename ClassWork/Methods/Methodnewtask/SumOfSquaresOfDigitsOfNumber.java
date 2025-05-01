package ClassWork.Methods.Methodnewtask;

import java.util.Scanner;

public class SumOfSquaresOfDigitsOfNumber {
    static double totalSum(int number){
        double sum = 0;
        while (number != 0) {
            sum += (number%10)*(number%10);
            number /= 10;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        sc.close();
        System.out.println("The sum of square of digits of "+n+" is: "+totalSum(n));
    }
}
