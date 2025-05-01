package ClassWork.Methods.Methodnewtask;

import java.util.Scanner;

public class PalindromePrime {
    static boolean primeChecker(int num){
        if(num <= 0){
            return false;
        }else if(num == 1){
            return true;
        }else{
            for(int i = 2;i<num;i++){
                if(num%i==0){
                    return false;
                }
            }
            return true;
        }
    }

    static boolean palindromeChecker(int num){
        int reverseNumber = 0;
        int originalNumber = num;
        while (num!=0) {
            reverseNumber = num%10 + reverseNumber * 10;
            num /= 10;
        }
        return (originalNumber==reverseNumber)?true:false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        sc.close();
        if(primeChecker(n) && palindromeChecker(n)){
            System.out.println("The number is Palindrome Prime.");
        }else if (primeChecker(n)){
            System.out.println("The number is prime but not palindrome.");
        }else if (palindromeChecker(n)){
            System.out.println("The number is palindrome but not a prime.");
        }else{
            System.out.println("The number is not prime palindrome.");
        }
    }
}
