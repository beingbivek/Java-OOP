package StackAndQueueTask;

public class Stack {

    int[] stack;
    int capacity;
    int top;
    public Stack (int capacity){
        stack = new int[capacity];
        this.capacity = capacity;
        top = -1;
    }

    public boolean isEmpty(){
        return top == -1;
    }

    public boolean isFull(){
        return top == capacity-1;
    }

    public void push(int element){
        if(isFull()){
            System.out.println("Stack Overflow");
        } else {
            top++;
            stack[top] = element;
        }
    }

    public int pop(){
        if(isEmpty()){
            System.out.println("Stack Underflow");
            return -99999;
        }
        int value = stack[top];
        top--;
        return value;
    }

    public int peek(){
        if(isEmpty()){
            System.out.println("Stack Underflow");
            return -9999;
        } else {
            return stack[top];
        }
    }

    public int size(){
        if(isEmpty()){
            return 0;
        } else if (isFull()) {
            return capacity;
        } else {
            return top + 1;
        }
    }

}
