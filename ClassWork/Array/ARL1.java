package ClassWork.Array;

import java.util.ArrayList;
// import java.util.Arrays;

public class ARL1 {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();

        //making arraylist from array

        // String[] strarr={"Max","Kev"};
        // ArrayList<String> list1=new ArrayList<>(Arrays.asList(strarr));

        list.add(7);
        list.add(8);
        list.set(0, 9);
        System.out.println(list);
        list.size();

        list.add(10);
        list.remove(0);  //index dine
        System.out.println(list);

        System.out.println(list.contains(8));
        System.out.println(list.indexOf(10));

        // ArrayList arr=new ArrayList<>();
        // arr.add(true);
        // arr.add(4);
        // arr.add("HIII");
        // System.out.println(arr);

        ArrayList<Integer> arr=arr_List();
        System.out.println(arr.size());

    }
    public static ArrayList<Integer> arr_List()
    {
        ArrayList<Integer> arr=new ArrayList<>();
        arr.add(2);
        arr.add(3);
        arr.set(1, 3);
        return arr;
    }

}