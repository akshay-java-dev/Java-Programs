public class ReverseDoublyLinkedList {

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

        Node current = first;
        Node temp = null;

        while (current != null) {

            temp = current.previous;
            current.previous = current.next;
            current.next = temp;

            current = current.previous;
        }

        first = temp.previous;

        System.out.print("Reversed List: ");

        current = first;

        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
    }
}
