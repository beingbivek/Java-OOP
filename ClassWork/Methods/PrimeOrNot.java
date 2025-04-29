package ClassWork.Methods;

import java.util.Scanner;

public class PrimeOrNot {
    static boolean primeChecker(int num){
        for(int i = 2; i < num;i++){
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (primeChecker(num)){
            System.out.println("The number is Prime");
        }else{
            System.out.println("The number isnot prime");
        }
        sc.close();
    }
}
