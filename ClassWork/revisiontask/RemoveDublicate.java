package ClassWork.revisiontask;

import java.util.Scanner;

public class RemoveDublicate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word: ");
        String word = sc.next();
        sc.close();
        String newWord = "";
        for (int i = 0; i < word.length(); i++){
            String w = Character.toString(word.charAt(i));
            if (!newWord.contains(w)){
                newWord += w;
            }
        }
        System.out.println(newWord);
    }
}
