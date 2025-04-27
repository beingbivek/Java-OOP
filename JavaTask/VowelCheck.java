package JavaTask;

import java.util.Scanner;

public class VowelCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char ch = sc.next().toLowerCase().charAt(0);
        
        switch (ch) {
            case 'a': case 'e': case 'i': case 'o': case 'u':
                System.out.println("The character is a vowel.");
                break;
            default:
                System.out.println("The character is not a vowel.");
        }
        sc.close();
    }
}

