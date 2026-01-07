class Queue {

    private int front =0;
    private int rear=-1;
    private int size=0;
    private int[] arr = new int[4];


    public void enqueue(int data){
        if (!isFull()){
            rear= (rear + 1) % arr.length;
            arr[rear] = data;
            size++;
        }
        else {
            System.out.println("Queue is Full");
        }
        
    }

    public int dequeue(){

        if (isEmpty()){
            throw new RuntimeException("Queue is Empty");
        }

        int data = arr[front];
        front= (front + 1) % arr.length;
        size--;
        return data;
    }

    public int peek(){
        if (isEmpty()){
            throw new RuntimeException("Queue is Empty");
        }
        return arr[front];
    }

    public boolean isFull(){
        return size == arr.length;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public void show(){
        for (int i=front;i<size;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}

public class Queue_1 {
    public static void main(String[] args){

        Queue queue = new Queue();

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(5);    
        queue.enqueue(99);
        

    
        queue.show();
    
        System.out.println("Dequeued: " + queue.dequeue());
        queue.enqueue(12);
        queue.enqueue(15);  // This will overwrite the oldest data if the queue is full
        System.out.println("Dequeued: " + queue.dequeue());
        System.out.println("Dequeued: " + queue.dequeue());
        System.out.println("Dequeued: " + queue.dequeue());
        System.out.println("peek: " + queue.peek());

    queue.show();}}