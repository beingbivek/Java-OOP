package ClassWork.Methods;

class FunctionReturn {
    static int add(int a,int b){
        return a+b;
    }

    static void multiply (int a, int b){
        System.out.println(a*b);
    }

    void add1(int a,int b){
        System.out.println(a+b);
    }

    static void GREET (){
        System.out.println("Hello");
    }

    public static void main(String[] args) {
        int sum = add(3,2);
        System.out.println(sum);
        multiply(4, 5);

        FunctionReturn functionReturn = new FunctionReturn();
        // add1 - without static this won't come to main so to call it..
        functionReturn.add1(2, 3);
        GREET();
    }
}