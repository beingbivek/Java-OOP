package ClassWork.Array;

import java.util.ArrayList;

public class ArrayListRevision {
    // methods for arraylist
    static ArrayList<Integer> methodName (ArrayList<Integer> arr){
        return arr;
    }
    public static void main(String[] args) {
        int[] array1 = new int[5];
        ArrayList<Integer> list = new ArrayList<>();
        array1[0] = 5;
        list.add(5);
        list.add(10);
        list.set(0, 15);
        System.out.println(list.get(0));
        list.remove(0);
        System.out.println(array1.length);
        System.out.println(list.size());
        // loop same as array
        for(int i = 0; i<list.size(); i++){
            System.out.println(list.get(i));
        }
        for (int val:list){
            System.out.println(val);
        }
        methodName(list);
        ArrayList<Integer> list2 = methodName(list);
    }
}
