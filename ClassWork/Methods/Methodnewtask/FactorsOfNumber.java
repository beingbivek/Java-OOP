package ClassWork.Methods.Methodnewtask;

import java.util.Scanner;

public class FactorsOfNumber {
    static void findFactors(int n){
        System.out.println("The Factors are: ");
        for(int i = 1; i<=n ; i++){
            if(n%i==0){
                System.out.println(i);
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        sc.close();
        findFactors(n);
    }
}
