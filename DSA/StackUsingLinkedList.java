public class StackUsingLinkedList {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    static Node top = null;

    static void push(int data) {
        Node newNode = new Node(data);
        newNode.next = top;
        top = newNode;
    }

    static void pop() {
        if (top == null) {
            System.out.println("Stack is empty");
            return;
        }

        System.out.println("Popped: " + top.data);
        top = top.next;
    }

    static void display() {
        Node current = top;

        System.out.print("Stack: ");

        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }

        System.out.println();
    }

    public static void main(String[] args) {

        push(10);
        push(20);
        push(30);

        display();

        pop();

        display();
    }
}
