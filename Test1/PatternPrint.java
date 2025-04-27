package Test1;

public class PatternPrint {
    public static void main(String[] args) {
        int num = 0;
        for(int i = 1; i <= 5; i++){
            num = i + num * 10;
            System.out.println(num);
        }
    }
}
