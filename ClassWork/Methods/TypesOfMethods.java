package ClassWork.Methods;

public class TypesOfMethods {

    //1. with return type, with parameter
    static int add(int a,int b){
        return a+b;
    }

    //2. with return type, without parameter
    static int add1(){
        int a = 2;
        int b = 3;
        return a+b;
    }

    // 3. without return type, with parameters
    static void add2(int a,int b){
        System.out.println(a+b);
    }

    // 4. without return type, without parameters
    static void add3(){
        int a = 1;
        int b = 9;
        System.out.println(a+b);
    }
    public static void main(String[] args) {
        int sum = add(2, 3);
        System.out.println(sum);
        sum = add1();
        System.out.println(sum);
        add2(5, 6);
        add3();
    }
}
