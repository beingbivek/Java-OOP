package ClassWork.revisiontask;

import java.util.Scanner;

public class AnyDigitFinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String wordString = sc.next();
        sc.close();
        Boolean found = false;
        for (int i = 0; i < wordString.length();i++){
            char w = wordString.charAt(i);
            if (Character.isDigit(w)){
                found = true;
                break;
            }
        }
        if (found){
            System.out.println("There is a digit.");
        }else{
            System.out.println("There's is not a digit.");
        }
    }
}
