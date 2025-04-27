package JavaTask;

import java.util.Scanner;

public class VowelOrConsonant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);
        String vowelString = "aeiouAEIOU";
        Boolean found = false;
        for (int i = 0;i<vowelString.length();i++){
            if (ch == vowelString.charAt(i)) {
                System.out.println("The character is a vowel.");
                found = true;
                break;
                }
            }
        
        if (!found) {
            System.out.println("The character is a consonant.");
        }
        
        sc.close();
    }
}

