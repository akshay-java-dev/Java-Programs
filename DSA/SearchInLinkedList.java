public class SearchInLinkedList {

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

        int target = 20;
        Node current = first;
        boolean found = false;

        while (current != null) {

            if (current.data == target) {
                found = true;
                break;
            }

            current = current.next;
        }

        if (found) {
            System.out.println("Element Found");
        } else {
            System.out.println("Element Not Found");
        }
    }
}
