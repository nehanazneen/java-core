package Day4;

import java.util.*;

public class circularQueue {
    private int maxSize;
    private int[] queueArray;
    private int front;
    private int rear;

    public circularQueue(int size) {
        maxSize = size;
        queueArray = new int[maxSize];
        front = -1;
        rear = -1;
    }

    public void enqueue(int item) {
        if (isEmpty()) {
            front = 0;
            rear = 0;
            queueArray[rear] = item;
        } else {
            rear = (rear + 1) % maxSize;
            if (rear == front) {
                System.out.println("Queue is full. Cannot enqueue.");
                rear = (rear - 1 + maxSize) % maxSize;
            } else {
                queueArray[rear] = item;
            }
        }
    }

    public int dequeue() {
        int item = -1;
        if (!isEmpty()) {
            item = queueArray[front];
            if (front == rear) {
                front = -1;
                rear = -1;
            } else {
                front = (front + 1) % maxSize;
            }
        } else {
            System.out.println("Queue is empty. Cannot dequeue.");
        }
        return item;
    }

    public int peek() {
        if (!isEmpty()) {
            return queueArray[front];
        } else {
            System.out.println("Queue is empty. No peek value.");
            return -1;
        }
    }

    public boolean isEmpty() {
        return front == -1 && rear == -1;
    }

    public static void main(String[] args) {
        circularQueue circularQueue = new circularQueue(5);
        circularQueue.enqueue(14);
        circularQueue.enqueue(13);
        circularQueue.enqueue(22);

        System.out.println("Peek: " + circularQueue.peek());
        System.out.println("Dequeue: " + circularQueue.dequeue()); // Should print 14
        System.out.println("Peek after dequeue: " + circularQueue.peek()); // Should print 13
    }
}
