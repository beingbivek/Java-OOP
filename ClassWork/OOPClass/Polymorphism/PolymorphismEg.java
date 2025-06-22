package ClassWork.OOPClass.Polymorphism;
//Polymorphism: having many forms
//objects of different classes to be treated as objects of same superclass
// 2. Method Overriding
public class PolymorphismEg{
    // 1. Method Overloading: Compile Time Polymorphism
    // Same method name but different length or datatype of parameters
    public void add(int a, int b){
        System.out.println("Two params");
        System.out.println(a+b);
    }
    // 1 and 2 has different length of arguements
    public void add(int a,int b,int c){
        System.out.println("Three params");
        System.out.println(a+b+c);
    }
    // 2 and 3 has different datatype as arguements
    public void add(int a,int b, String name){
        System.out.println("Two int and a string param");
        System.out.println(a+b);
    }
}
class Parent{
    // 2. Method Overriding
    public void greet(){
        System.out.println("Parent says hello");
    }
    public void name(String name){
        System.out.println("Parent has name: "+name);
    }
}
 
class Child extends Parent{
    @Override
    public void name(String name){
        System.out.println("Child has name: "+name);
    }
}
 
class PolymorphismExample{
    public static void main(String[] args) {
        PolymorphismEg poly = new PolymorphismEg();
        poly.add(1, 2);
        poly.add(1, 2, 3);
        poly.add(1, 2, "Max");
    }
}