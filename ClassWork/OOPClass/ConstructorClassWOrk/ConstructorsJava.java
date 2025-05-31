package ClassWork.OOPClass.ConstructorClassWOrk;

public class ConstructorsJava{
    int num;
    //Non parameterized constructor
    ConstructorsJava(){
        System.out.println("Non parametertized Constructor");
    }

    //Parameterized Constructor
    ConstructorsJava(int a){
        num = a;
    }

    ConstructorsJava(int num, int b){
        int sum = num+b;
        this.num = num; // this will assign the num from the class
        System.out.println(sum);
    }

    ConstructorsJava(String val){
        System.out.println("New parametrized with "+val);
    }

    // Copy Constructor
    ConstructorsJava(ConstructorsJava obj){
        System.out.println("Copy Constructor");
        num = obj.num;
    }

    void setNum(int num){
        this.num = num;
    }
}

class UsingConstructor {
    public static void main(String[] args) {
        @SuppressWarnings("unused")
        ConstructorsJava obj1 = new ConstructorsJava();
        ConstructorsJava obj2 = new ConstructorsJava(1);
        @SuppressWarnings("unused")
        ConstructorsJava obj3 = new ConstructorsJava(12, 2);
        @SuppressWarnings("unused")
        ConstructorsJava obj4 = new ConstructorsJava("Hello");
        @SuppressWarnings("unused")
        ConstructorsJava obj5 = new ConstructorsJava(obj2);
    }
}