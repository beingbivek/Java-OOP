package ClassWork.Array;

import java.util.Arrays;
import java.util.Scanner;

/*
 * 1d array:
 * datatype[] name = new datatype[size]
 * Arrays.toString
 * Arrays.length returns length of array
 * starts form array[0]
 * 
 * 2d array:
 * datatype[][] name = new datatype[rows][colum]
 * Arrays.deepToString
 * Arrays.length returns length of rows
 * starts form array[0][0]
 */

public class ArrayExcercise2 {
    static int[] arrayMethod(){
        int[] array1 = new int[5];
        return array1;
    }

    static int lengthArray(int[] arr){
        return arr.length;
    }

    static void printArray(int[] arr){
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int[] array1 = {1,2,3,4,5};
        int[] newArray = arrayMethod();
        // int length = lengthArray(newArray);
        printArray(newArray);

        // 2D Array
        int[][] twoDArray = new int[3][2];
        //datatypeofelement[][] arrayName = new datatypeofelement[rows][column];
        int rowLength = twoDArray.length;
        int columnLength = twoDArray[0].length;
        // System.out.println(twoDArray[1].length);

        //taking values for 2d array
        for(int i = 0; i<rowLength;i++){
            for(int j = 0; j < columnLength;j++){
                System.out.print("Enter number for "+i+" row "+j+" column: ");
                twoDArray[i][j] = sc.nextInt();
            }
            // System.out.println();
        }
        //printing 1st method
        for(int i = 0; i<rowLength;i++){
            for(int j = 0; j < columnLength;j++){
                System.out.print(twoDArray[i][j]+"  ");
                // twoDArray[i][j] = sc.nextInt();
            }
            System.out.println();
        }
        // Another way to print
        for(int[] row:twoDArray){
            for(int value:row){
                System.out.println(value);
            }
        }

        // printing 2d array into string
        System.out.println(Arrays.deepToString(twoDArray));
        sc.close();
    }
}
