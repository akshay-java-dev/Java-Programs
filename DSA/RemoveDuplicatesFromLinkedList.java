public class RemoveDuplicatesFromLinkedList {

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
        Node third = new Node(20);
        Node fourth = new Node(30);
        Node fifth = new Node(30);

        first.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;

        Node current = first;

        while (current != null && current.next != null) {

            if (current.data == current.next.data) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }

        current = first;

        System.out.print("After Removing Duplicates: ");

        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
    }
}
