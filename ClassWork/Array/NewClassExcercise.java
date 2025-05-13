package ClassWork.Array;

import java.util.Arrays;

public class NewClassExcercise {
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
        // int[] array1 = {1,2,3,4,5};
        int[] newArray = arrayMethod();
        int length = lengthArray(newArray);
        printArray(newArray);
    }
}
