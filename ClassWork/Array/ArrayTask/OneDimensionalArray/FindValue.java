package ClassWork.Array.ArrayTask.OneDimensionalArray;

import java.util.Scanner;

public class FindValue {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number to be found: ");
        int n = sc.nextInt();
        sc.close();
        Boolean isfound = false;
        for(int val:arr) if (val == n) isfound = true;
        if(isfound) System.out.println("Number Found!");
        else System.out.println("Not Found");
    }
}