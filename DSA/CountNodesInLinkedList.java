public class CountNodesInLinkedList {

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

        first.next = second;
        second.next = third;
        third.next = fourth;

        int count = 0;
        Node current = first;

        while (current != null) {
            count++;
            current = current.next;
        }

        System.out.println("Number of Nodes = " + count);
    }
}
