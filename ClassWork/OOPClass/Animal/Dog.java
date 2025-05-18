package ClassWork.OOPClass.Animal;

public class Dog {
    String name;
    int age;
    String color;
    void bark(){
        System.out.println(name+" can Bark!");
    }
    void wag(){
        System.out.println(name+" wags its tail.");
    }
    void printDetails(){
        System.out.println("Name: "+name);
        System.out.println("age: "+age);
        System.out.println("color: "+color);
    }
    int getAge(){
        return age;
    }
    String getName(){
        return name;
    }
    String getColor(){
        return color;
    }

}
