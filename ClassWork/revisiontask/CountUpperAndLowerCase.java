package ClassWork.revisiontask;

import java.util.Scanner;

public class CountUpperAndLowerCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence: ");
        String sentenceString = sc.nextLine();
        sc.close();
        int lenOfString = sentenceString.length();
        int countOfUpper = 0;
        int countOfLower = 0;
        // System.out.println(lenOfString);
        // System.out.println(Character.isLowerCase(' ')); // Space is neither upper nor lower case.
        for (int i = 0; i < lenOfString; i++){
            char a=sentenceString.charAt(i);
            // System.out.println(a);
            // String c = Character.toString(a);
            // Character.isLowerCase(a);
            if (a >= 'a' && a <= 'z'){
                countOfLower++;
            } else if (a >= 'A' && a<= 'Z'){
                countOfUpper++;
            }
            // if (Character.isUpperCase(a)){

            // }
            
            // if (Character.toString(a) == Character.toString(a).toUpperCase()){
            //     countOfUpper++;
            // }else if (Character.toString(a) == Character.toString(a).toLowerCase()){
            //     countOfLower++;
            // }
        }
        System.out.println(countOfUpper + " " + countOfLower);
    }
}
