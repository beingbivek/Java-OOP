package ClassWork.revisiontask;

import java.util.Scanner;

public class ReplaceAllVowelWithAsterisk {
    public static void main(String[] args) {
        String vowString = "aeiouAEIOU";
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence: ");
        String sentenceString = sc.nextLine();
        sc.close();
        String newString = "";
        Boolean found = false;
        for (int i = 0; i < sentenceString.length();i++){
            char c = sentenceString.charAt(i);
            for (int j = 0; j < vowString.length(); j++){
                found = false;
                char n = vowString.charAt(j);
                if (c==n){
                    newString += "*";
                    found = true;
                    break;
                }
            } 
            if (!found){
                newString += c;
            }
        }
        System.out.println(newString);
    }
}
