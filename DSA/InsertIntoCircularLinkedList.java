public class InsertIntoCircularLinkedList {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static void main(String[] args) {

        Node first = new Node(10);
        Node second = new Node(30);

        first.next = second;
        second.next = first;

        // Insert 20 between 10 and 30
        Node newNode = new Node(20);

        newNode.next = second;
        first.next = newNode;

        Node current = first;

        System.out.print("After Insertion: ");

        do {
            System.out.print(current.data + " ");
            current = current.next;
        } while (current != first);
    }
}
