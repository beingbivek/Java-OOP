package ClassWork.Methods.Methodnewtask;

import java.util.Scanner;

public class CountWords {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a long sentence: ");
        String newString = sc.nextLine();
        sc.close();
        int noOfWords = findNoOfWords(newString);
        System.out.println("The no. of words are: "+noOfWords);
    }

    public static int findNoOfWords(String newString) {
        int noOfWords=0;
        for(int i = 0;i<newString.length();i++){
            if (newString.charAt(i) == ' '){
                noOfWords++;
            }
        }
        return noOfWords+1;
    }
}
