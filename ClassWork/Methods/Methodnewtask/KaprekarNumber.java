package ClassWork.Methods.Methodnewtask;

import java.util.Scanner;

class KaprekarNumber {
    static int convertIntToString(String num){
        return Integer.valueOf(num);
    }
    static boolean isKaprekar(int num){
        String squareNum = String.valueOf(num*num);
        int lengthOfSquareNum = squareNum.length();
        // if(lengthOfSquareNum % 2 == 0){
        int halfLength = lengthOfSquareNum / 2;
        String firstHalf = squareNum.substring(0, halfLength);
        String secondHalf = squareNum.substring(halfLength, lengthOfSquareNum);
        int sum = convertIntToString(firstHalf) + convertIntToString(secondHalf);
        return (sum == num) ? true : false;
        // }
        // return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        sc.close();

        if(isKaprekar(n)){
            System.out.println(n+ " is a Kaprekar Number.");
        }else{
            System.out.println(n+" is not a Kaprekar Number.");
        }
    }
    
}