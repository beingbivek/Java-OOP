package StackAndQueueTask;

import java.util.Scanner;

public class CustomerQueue {
    String[] customerQueue;
    int capacity;
    int front;
    int rear;
    int size;
    public CustomerQueue(int capacity){
        customerQueue = new String[capacity];
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

    public void addCustomer(String customerName){
        if(isFull()){
            System.out.println("Customer Full");
        } else {
            // rear++;
            rear=(rear+1)%capacity;
            size++;
            customerQueue[rear] = customerName;
        }
    }

    public String serveCustomer(){
        if(isEmpty()){
            System.out.println("No Customers");
            front = 0;
            rear = -1;
            return "No Customers";
        } else {
            String customer = customerQueue[front];
            front=(front+1)%capacity;
            size--;
            return customer;
        }
    }


    public String currentCustomer(){
        if(isEmpty()){
            System.out.println("No Customers");
            front = 0;
            rear = -1;
            return "No Customers";
        } else {
            String customer = customerQueue[front];
            return customer;
        }
    }

    public int queueSize(){
        return size;
    }
}

class QueueManagementSystem{
    public static void main(String[] args) {
        CustomerQueue customerQueue = new CustomerQueue(10);
        boolean runProgram = true;
        while (runProgram) {
            String welcomeString = """
                a. Add a customer to the queue.

                b. Serve the next customer in the queue.

                c. Display the current queue.

                d. Display the number of customers in the queue.

                e. Exit the program
                """;
            Scanner sc = new Scanner(System.in);
            System.out.println(welcomeString);
            char choice = sc.next().charAt(0);
            switch (choice) {
                case 'a':
                    System.out.println("Enter Customer Name: ");
                    String customerString =  sc.nextLine();
                    customerQueue.addCustomer(customerString);
                    break;
                
                case 'b':
                    System.out.println("Serving Customer: ");
                    System.out.println(customerQueue.serveCustomer());
                    break;

                case 'c':
                    System.out.println("The Next Customer is: ");
                    System.out.println(customerQueue.currentCustomer());
                    break;

                case 'd':
                    System.out.println("The number of customers in line: ");
                    System.out.println(customerQueue.queueSize());
                    break;

                case 'e':
                    runProgram = false;
            
                default:
                    System.out.println("Invalid Input Given!");
                    break;
            }
            sc.close();
        }
    }
}