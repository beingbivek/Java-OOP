package Test1;

import java.util.Scanner;

public class ReverseWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word: ");
        String newString = sc.next();
        String reverseString = "";
        for (int i = newString.length() - 1; i >= 0; i--){
            reverseString += newString.charAt(i);
        }
        System.out.println("The reversed string is: "+reverseString);
        sc.close();
    }
}
