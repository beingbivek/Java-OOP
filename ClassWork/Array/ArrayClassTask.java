package ClassWork.Array;

import java.util.Scanner;

public class ArrayClassTask {
    static void printEven(int[][] arr){
        System.out.println("Even Numbers are: ");
        for(int[] row:arr){
            for(int value:row){
                if (value % 2 == 0) System.out.println(value);
            }
        }
    }
    public static void main(String[] args) {
        int[][] numbers = new int[4][5];
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < numbers.length; i++){
            for(int j = 0; j < numbers[0].length; j++){
                numbers[i][j] = sc.nextInt();
            }
        }
        printEven(numbers);
        sc.close();
    }
}
