public class CircularLinkedList {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static void main(String[] args) {

        Node first = new Node(10);
        Node second = new Node(20);
        Node third = new Node(30);

        first.next = second;
        second.next = third;

        // Last node points back to first
        third.next = first;

        Node current = first;

        System.out.print("Circular Linked List: ");

        do {
            System.out.print(current.data + " ");
            current = current.next;
        } while (current != first);
    }
}
