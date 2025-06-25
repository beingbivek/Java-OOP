package StackAndQueueTask;

public class CustomStack {
    int[] myCustomStack;
    int capacity;
    int top;
    public CustomStack(int capacity){
        myCustomStack = new int[capacity];
        this.capacity = capacity;
        top = -1;
    }

    public boolean isEmpty(){
        return top == -1;
    }

    public boolean isFull(){
        return top == capacity -1;
    }

    public void push(int val){
        if(isFull()){
            System.out.println("Stack Overflow");
        } else {
            top++;
            myCustomStack[top] = val;
        }
    }

    public int pop(){
        if(isEmpty()){
            System.out.println("Stack underflow");
            return -99999;
        } else {
            int value = myCustomStack[top];
            top--;
            return value; 
        }
    }

    public int peek(){
        if(isEmpty()){
            System.out.println("Stack Underflow");
            return -9999;
        } else {
            return myCustomStack[top];
        }
    }
}
