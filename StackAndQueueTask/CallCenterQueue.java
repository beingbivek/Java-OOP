package StackAndQueueTask;

import java.util.Scanner;

public class CallCenterQueue {
    String[] callQueue;
    int capacity;
    int front;
    int rear;
    int size;
    public CallCenterQueue(int capacity){
        callQueue = new String[capacity];
        this.capacity = capacity;
        front = 0;
        rear = -1;
        size = 0;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public boolean isFull(){
        return size == capacity;
    }

    public void addIncommingCall(String callerName){
        if(isFull()){
            System.out.println("Caller Queue Full");
        } else {
            rear = (rear+1)%capacity;
            size++;
            callQueue[rear] = callerName;
        }
    }

    public String serveNextCall(){
        if(isEmpty()){
            System.out.println("No Caller in queue.");
            rear = -1;
            front = 0;
            return "No Caller in queue.";
        } else {
            String caller = callQueue[front];
            front = (front+1)%capacity;
            size--;
            return caller;
        }
    }

    public String currentCaller(){
        if(isEmpty()){
            System.out.println("No Caller in queue.");
            rear = -1;
            front = 0;
            return "No Caller in queue.";
        } else {
            return callQueue[front];
        }
    }

    public int pendingCalls(){
        return size;
    }
}

class CallCenterCalls{
    public static void main(String[] args) {
        CallCenterQueue callerQueue = new CallCenterQueue(20);
        boolean runProgram = true;
        while (runProgram) {
            String welcomeString = """
                    a. Add an incoming call to the queue.

                    b. Serve and handle the next call in the queue.

                    c. Display the current call queue.

                    d. Display the number of pending calls.

                    e. Exit the program.
                    """;
            System.out.println(welcomeString);
            Scanner sc = new Scanner(System.in);
            System.out.println();
            char choice = sc.next().charAt(0);
            switch (choice) {
                case 'a':
                    System.out.println("Enter the caller name: ");
                    callerQueue.addIncommingCall(sc.next());
                    break;

                case 'b':
                    System.out.println("Serve Next Caller: ");
                    System.out.println(callerQueue.serveNextCall());
                    break;

                case 'c':
                    System.out.println("Current Caller: ");
                    System.out.println(callerQueue.currentCaller());
                    break;

                case 'd':
                    System.out.println("Pending Calls: ");
                    System.out.println(callerQueue.pendingCalls());
                    break;

                case 'e':
                    runProgram = false;

                default:
                    System.out.println("Invalid Input!");
                    break;
            }
            sc.close();
        }
    }
}
