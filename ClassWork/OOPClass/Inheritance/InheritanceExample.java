package ClassWork.OOPClass.Inheritance;

class MyAnimal{
    // Parent class or Super class
    // when you create object for the child, the parent non parameterized constructor gets called first and then child constructor runs
    public MyAnimal(){
        System.out.println("Animal Constructor non parameterized");
    }
    public MyAnimal(int age){
        System.out.println("Animal Constructor Parameterized" + age);
    }
    public void eat(){
        System.out.println("Animal eats");
    }
    public void walk(){
        System.out.println("Animal might walk");
    }
}

class Human extends MyAnimal{
    // Child class or subclass
    public Human (){
        // super(3); to run parameterized parent constructor at first.
        System.out.println("Human Constructor");
    }
    public void talk(){
        System.out.println("Human talks");
    }
    // when parent and child have same method, the method from child is called - also knowns as polymorphism
    public void walk(){
        // super refers to the attributes and methods of immediate(one step) parent
        super.walk(); // also referred as Animal.walk()
        System.out.println("Human walks");
    }

}
// multilevel inheritance - one parent multiple childs
// Parent MyAnimal has Human and Dog.
class Dog extends MyAnimal{
    public Dog(){
        System.out.println("Dog Constructor");
    }
    public void bark(){
        System.out.println("Dog Barks!");
    }
    public void walk(){
        System.out.println("Dog Walks");
    }
}

// hierrarchial inheritance -- inheritances in levels
// MyAnimal is the parent of Dog, Dog is the parent of Laborador.
class Laborador extends Dog{
    public void showLove(){
        System.out.println("Licks you!");
    }
}

class Bird{
    public void eat(){
        System.out.println("Bird eats");
    }
    public void fly(){
        System.out.println("Bird might fly");
    }
}

class Ostrich extends Bird{
    public void fly(){
        System.out.println("Ostrich doesn't fly");
    }
    public void greet(){
        System.out.println("Ostrich says hi");
    }
}

class Eagle extends Bird{
    public void greet(){
        System.out.println("Eagle says hi");
    }
}

public class InheritanceExample {
    public static void main(String[] args) {
        Human human1 = new Human();
        human1.eat();
        human1.walk();
        human1.talk();
        // MyAnimal animal1 = new MyAnimal();
        // animal1.eat();
        // animal1.walk();
        // animal1.talk(); not possible because parent can't access child methods
        
        Eagle eagle1 = new Eagle();
        eagle1.fly();
        
    }
}
