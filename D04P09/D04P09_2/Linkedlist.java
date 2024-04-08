package Day4;


class Node {
    double data;
    Node next;

    public Node(double d) {
        data = d;
        next = null;
    }
}

class Stack {
    Node top;

    public Stack() {
        top = null;
    }

    // Push operation: Insert a new element at the beginning of the linked list
    void push(double data) {
        Node temp = new Node(data);
        if (temp == null) {
            System.out.println("\nStack Overflow");
            System.exit(1);
        }
        temp.data = data;
        temp.next = top;
        top = temp;
    }

    // Pop operation: Remove the first element from the linked list
    void pop() {
        if (top == null) {
            System.out.println("\nStack Underflow");
            System.exit(1);
        } else {
            Node temp = top;
            top = top.next;
            temp = null;
        }
    }

    // Display operation: Print all elements in the stack
    void display() {
        Node temp = top;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(10.0);
        stack.push(20.0);
        stack.push(30.0);
        stack.push(40.0);

        System.out.print("The elements of the stack are: ");
        stack.display();

        stack.pop();
        stack.pop();

        System.out.print("After popping twice: ");
        stack.display();
    }
}
