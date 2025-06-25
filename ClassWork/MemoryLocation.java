package ClassWork;

public class MemoryLocation {
    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = "hello";
        String str3 = new String("hello");
        String str4 = new String("hello");
        System.out.println(str1==str2);
        System.out.println(str1.equals(str2));
        System.out.println(str3==str4); // == compares two memory address rather than value
        System.out.println(str3.equals(str4)); // .equals() compares value
    }
}

// Exam questions: JVM,JDK,this, Stack,Static,4 oop principles
// stack implimentaion on webbrowser & other implimentation of stack