package Week1.loops;

import java.util.Arrays;
import java.util.Scanner;

public class Classtask {
    public static void main(String[] args) {
        //Multiplication Table
        // for (int i = 1; i < 11; i++){
        //     for (int j = 1; j < 11; j++){
        //         int p = i * j;
        //         System.out.println(i + " * " + j + " = " + p);
        //     }
        //     System.out.println();
        // }

        // Sum of the number until the user integer
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter a Number: ");
        // int num = sc.nextInt();
        // int sum = 0;
        // for (int i = 1; i <= num; i++){
        //     sum += i;
        // }
        // System.out.println(sum);

        String myString = "Hello";
        String myString2 = "World";
        System.out.println(myString.toLowerCase());
        System.out.println(myString.toUpperCase());
        System.out.println(myString.equals(myString2));
        System.out.println(myString.equals("hello"));
        System.out.println(myString.equalsIgnoreCase("hello"));
        String mySentence = "My name is Bivek Thapa";
        System.out.println(myString.concat(myString2));
        String[] splittedSentence = mySentence.split(" ");
        System.out.println(Arrays.toString(splittedSentence));
        int lenOfString = mySentence.length();
        System.out.println("length of string = " + lenOfString);
        String newSubString = mySentence.substring(1,4);
        System.out.println(newSubString);
        System.out.println(mySentence.contains(newSubString));



    }
}
