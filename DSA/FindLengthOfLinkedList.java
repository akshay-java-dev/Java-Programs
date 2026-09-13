public class FindLengthOfLinkedList {

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
        Node fourth = new Node(40);
        Node fifth = new Node(50);

        first.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;

        int length = 0;

        Node current = first;

        while (current != null) {
            length++;
            current = current.next;
        }

        System.out.println("Length of Linked List = " + length);
    }
}
