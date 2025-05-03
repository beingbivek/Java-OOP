package ClassWork.Methods.Methodnewtask;

import java.util.Scanner;

public class CountUpperAndLowerCase {
    static int countUpperCase(String newString){
        int countUpper = 0;
        for (int i = 0; i < newString.length();i++){
            if (Character.isUpperCase(newString.charAt(i))){
                countUpper++;
            }
        }
        return countUpper;
    }
    static int countLowerCase(String newString){
        int countLower = 0;
        for (int i = 0; i < newString.length();i++){
            if (Character.isLowerCase(newString.charAt(i))){
                countLower++;
            }
        }
        return countLower;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String newString = sc.nextLine();
        sc.close();

        int numberOfUpper = countUpperCase(newString);
        int numberOfLower = countLowerCase(newString);
        System.out.println("The number of Upper case are: "+numberOfUpper);
        System.out.println("The number of Lower case are: "+numberOfLower);
    }
    
}
