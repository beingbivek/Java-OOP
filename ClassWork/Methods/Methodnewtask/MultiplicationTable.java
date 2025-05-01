package ClassWork.Methods.Methodnewtask;

public class MultiplicationTable {
    static void printMultiplicaiton(int a,int b){
        System.out.println(a+" * "+b+" = "+a*b);
    }
    public static void main(String[] args) {
        for(int i = 1;i<=10;i++){
            for(int j =1;j<=10;j++){
                printMultiplicaiton(i,j);
            }
            System.out.println();
        }
    }
}
