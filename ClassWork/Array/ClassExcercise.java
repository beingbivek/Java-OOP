package ClassWork.Array;

import java.util.Arrays;
import java.util.Scanner;

// oop
 
// Array
// 1 dimentional - {1,2,3}
// multidimentional - [{1,2},{2,3}]
 
// fixed size
// all elements have same datatype
 
// syntax
// 1. int[] array1 = new int[5];

// 2. int[] array1;

//  array1 = new int[5];

// 3. int [] array1 = {1,2,3,4,5};

// 4. int [] array1 = new int[] {1,2,4};
 
// array1.length; correct
// array1.length(); incorrect
 
public class ClassExcercise {
    public static void main(String[] args) {
        int[] array1 = new int[5];
        int[] array2 = {1,2,3,4,5};
        // array1[5]=2; ArrayIndexOutOfBoundsException
        // System.out.println(array1+" "+array2);
        int len = array1.length;
        // for (int i = 0; i < len-1; i++){
        //     array1[i]=i;
        // }
        // System.out.println(array1.toString());
        Scanner sc = new Scanner(System.in);
        
        for (int i = 0; i < len; i++){
            System.out.print("Enter "+(i+1)+"th number: ");
            array1[i] = sc.nextInt();
        }
        sc.close();
        System.out.println(Arrays.toString(array1));
        // for (int i = 0;i<len;i++){System.out.println(array1[i]);};
        for (int arr: array1){ // it gives one element at a time in variable arr
            System.out.println(arr);
        }
        Arrays.fill(array1,0);

        Arrays.sort(array1);

        int[] arrayC = Arrays.copyOf(array1, array1.length);

        System.out.println(Arrays.equals(array1, arrayC));

    }
    
}
