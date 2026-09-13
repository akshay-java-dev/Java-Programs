public class DeleteNodeFromDoublyLinkedList {

    static class Node {
        int data;
        Node previous;
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

        second.previous = first;
        second.next = third;

        third.previous = second;

        // Delete second node
        first.next = third;
        third.previous = first;

        Node current = first;

        System.out.print("After Deletion: ");

        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
    }
}
