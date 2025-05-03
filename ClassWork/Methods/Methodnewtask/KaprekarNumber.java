package ClassWork.Methods.Methodnewtask;

import java.util.Scanner;

class KaprekarNumber {
    static int divideIntIntoHalves(int num,int index){
        while (num!=0) {
            
        }
        return num;
    }
    static boolean isKaprekar(int num){
        int squareNum = num * num;
        int lengthOfSquareNum = String.valueOf(squareNum).length();
        if(lengthOfSquareNum % 2 == 0){
            int halfLength = lengthOfSquareNum / 2;
            int firstHalf = 0;
            int secondHalf = 0;
            int count = 0;
            while(squareNum!=0){
                if(count < halfLength){
                    firstHalf = firstHalf + squareNum % 10;
                    count++;
                    squareNum /= 10;
                }else{
                    secondHalf = secondHalf * 10 + squareNum % 10;
                    count++;
                    squareNum /= 10;
                }
            }
            System.out.println(firstHalf);
            System.out.println(secondHalf);

        }
        return false;
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