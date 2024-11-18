package Queue;

public class CircularQueue {
    private int[] queue;
    private int front, rear, size;

    public CircularQueue(int size) {
        this.size = size;
        this.queue = new int[size];
        this.front = -1;
        this.rear = -1;
    }

    public boolean isEmpty() {
        return front == -1;
    }


    public boolean isFull() {
        return (rear + 1) % size == front;
    }

    
    public void enqueue(int value) {
        if (isFull()) {
            System.out.println("Queue is full!");
            return;
        }
        if (front == -1) {
            front = 0;
        }
        rear = (rear + 1) % size;
        queue[rear] = value;
        System.out.println("Enqueued: " + value);
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty!");
            return -1;
        }
        int dequeuedValue = queue[front];
        if (front == rear) { 
            front = rear = -1;
        } else {
            front = (front + 1) % size;
        }
        System.out.println("Dequeued: " + dequeuedValue);
        return dequeuedValue;
    }

    public int front() {
        if (isEmpty()) {
            System.out.println("Queue is empty!");
            return -1;
        }
        return queue[front];
    }


    public int rear() {
        if (isEmpty()) {
            System.out.println("Queue is empty!");
            return -1;
        }
        return queue[rear];
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty!");
            return;
        }
        int i = front;
        while (i != rear) {
            System.out.print(queue[i] + " ");
            i = (i + 1) % size;
        }
        System.out.println(queue[rear]);
    }

    public static void main(String[] args) {
        CircularQueue cq = new CircularQueue(5);
        cq.enqueue(10);
        cq.enqueue(20);
        cq.enqueue(30);
        cq.enqueue(40);
        cq.enqueue(50);
        cq.dequeue();
        cq.enqueue(60);
        cq.display();
    }
}
