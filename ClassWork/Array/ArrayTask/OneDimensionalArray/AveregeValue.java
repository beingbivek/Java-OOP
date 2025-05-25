package ClassWork.Array.ArrayTask.OneDimensionalArray;

public class AveregeValue {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,45};
        int sum = 0;
        int arrLength = arr.length;
        for(int val:arr) sum += val;
        double average = ((double) sum)/((double) arrLength);
        System.out.println("Average is: "+average);
    }
}
