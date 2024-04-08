package Day4;


import java.util.ArrayList;

class Stack<T> {
    private ArrayList<T> A;
    private int top = -1;
    private int size;

    public Stack(int size) {
        this.size = size;
        this.A = new ArrayList<>(size);
    }

    public void push(T X) {
        if (top + 1 == size) {
            System.out.println("Stack Overflow");
        } else {
            top = top + 1;
            if (A.size() > top)
                A.set(top, X);
            else
                A.add(X);
        }
    }

    public T top() {
        if (top == -1) {
            System.out.println("Stack Underflow");
            return null;
        } else
            return A.get(top);
    }

    public void pop() {
        if (top == -1) {
            System.out.println("Stack Underflow");
        } else
            top--;
    }

    public boolean empty() {
        return top == -1;
    }

    public String toString() {
        String Ans = "";
        for (int i = 0; i < top; i++) {
            Ans += String.valueOf(A.get(i)) + "->";
        }
        Ans += String.valueOf(A.get(top));
        return Ans;
    }
}

public class Stackarray {
    public static void main(String[] args) {
        Stack<Integer> s1 = new Stack<>(3);
        s1.push(10);
        s1.push(20);
        s1.push(30);
        System.out.println("s1 after pop:\n" + s1);

        Stack<String> s2 = new Stack<>(3);
        s2.push("Hello");
        s2.push("world");
        s2.push("java");
        System.out.println("s2 after pushing 3 elements:\n" + s2);

        s2.pop(); // Pop one element
        System.out.println("s2 after popping:\n" + s2);

        Stack<Float> s3 = new Stack<>(2);
        s3.push(100.0f);
        s3.push(200.0f);
        System.out.println("s3 after pushing 2 elements:\n" + s3);
        System.out.println("Top element of s3:\n" + s3.top());
    }
}
