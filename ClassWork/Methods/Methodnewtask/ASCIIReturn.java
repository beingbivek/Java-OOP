package ClassWork.Methods.Methodnewtask;

import java.util.Scanner;

public class ASCIIReturn {
    static int getAscii(char asciiChar){
        return (int) asciiChar;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a character: ");
        char newChar = sc.next().charAt(0);
        sc.close();

        System.out.println("Your ASCII value is: "+getAscii(newChar));
    }
}
