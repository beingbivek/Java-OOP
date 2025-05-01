package ClassWork.Methods.Methodnewtask;

import java.util.Scanner;

public class DuckNumber {
    static boolean isDuckNumber(int n){
        boolean isDN = false;
        while (n!=0) {
            if(n%10==0){
                isDN = true;
                break;
            }
            n /= 10;
        }
        return isDN;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        sc.close();
        if(isDuckNumber(n)){
            System.out.println("The number is duck number.");
        }else{
            System.out.println("The number is not a duck number.");
        }
    }
}
