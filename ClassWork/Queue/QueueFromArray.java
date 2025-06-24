public class QueueFromArray {
    int[] queue;
    int capacity;
    int front; //to mark first added- items are retrived from here
    int rear; //to mark last added- items are added here
    public QueueFromArray(int capacity){
        queue = new int[capacity];
        this.capacity = capacity;
        front = 0;
        rear = -1;
    }

    public boolean isEmpty(){
        return front>rear;
    }

    public boolean isFull(){
        return rear == capacity - 1;
    }

    public void enqueue(int value){ // like Push
        if (isFull()){
            System.out.println("Queue overflow");
        } else {
            rear++;
            queue[rear]=value;
        }
    }

    public int dequeue(){ // like pop
        if(isEmpty()){
            System.out.println("Queue underflow");
            front = 0;
            rear = -1;
            return -99999;
        } else {
            int value = queue[front];
            front++;
            return value;
        }
    }

    public int peek(){
        if(isEmpty()){
            System.out.println("Queue underflow");
            front = 0;
            rear = -1;
            return -99999;
        }
        return queue[front];
    }
}
