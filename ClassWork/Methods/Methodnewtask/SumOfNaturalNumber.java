package ClassWork.Methods.Methodnewtask;

import java.util.Scanner;

public class SumOfNaturalNumber {
    static int sumOfNaturalNumber(int n){
        int sum = 0;
        for(int i = 1;i<=n;i++){
            sum += i;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        sc.close();
        System.out.println("The sum is: "+sumOfNaturalNumber(n));
        
    }
}
