package ClassWork.Stack;
// This file is the implimentation of stackfromarray file in practical world

public class UsingStackFromArray {
    public static void main(String[] args) {
        StackFromArray stackFromArray = new StackFromArray(6);
        stackFromArray.push(10);    
        stackFromArray.push(20);    
        System.out.println(stackFromArray.peek());
        System.out.println(stackFromArray.pop());
        System.out.println(stackFromArray.pop());
        System.out.println(stackFromArray.isEmpty());
        System.out.println(stackFromArray.isFull());
    }
}
