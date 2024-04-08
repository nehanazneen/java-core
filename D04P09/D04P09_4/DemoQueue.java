package Day4;


public class DemoQueue {
    private int maxSize;
    private int[] queueArray;
    private int front;
    private int rear;
    private int currentSize;

    public DemoQueue(int size) {
        this.maxSize = size;
        this.queueArray = new int[size];
        front = 0;
        rear = -1;
        currentSize = 0;
    }

    public void insert(int item) {
        if (isQueueFull()) {
            System.out.println("Queue is full!");
            return;
        }
        if (rear == maxSize - 1) {
            rear = -1;
        }
        queueArray[++rear] = item;
        currentSize++;
        System.out.println("Item added to queue: " + item);
    }

    public int delete() {
        if (isQueueEmpty()) {
            throw new RuntimeException("Queue is empty");
        }
        int temp = queueArray[front++];
        if (front == maxSize) {
            front = 0;
        }
        currentSize--;
        return temp;
    }

    public int peek() {
        return queueArray[front];
    }

    public boolean isQueueFull() {
        return (maxSize == currentSize);
    }

    public boolean isQueueEmpty() {
        return (currentSize == 0);
    }

    public static void main(String[] args) {
        DemoQueue queue = new DemoQueue(10);
        queue.insert(10);
        queue.insert(20);
        queue.insert(30);
        queue.insert(40);

        System.out.println("Item deleted from queue: " + queue.delete());
        System.out.println("Item deleted from queue: " + queue.delete());

        queue.insert(50);
        System.out.println("Item deleted from queue: " + queue.delete());
    }
}
