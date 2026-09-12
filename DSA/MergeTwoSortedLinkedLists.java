public class MergeTwoSortedLinkedLists {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static void main(String[] args) {

        Node a1 = new Node(1);
        Node a2 = new Node(3);
        Node a3 = new Node(5);

        a1.next = a2;
        a2.next = a3;

        Node b1 = new Node(2);
        Node b2 = new Node(4);
        Node b3 = new Node(6);

        b1.next = b2;
        b2.next = b3;

        Node dummy = new Node(0);
        Node current = dummy;

        Node first = a1;
        Node second = b1;

        while (first != null && second != null) {

            if (first.data < second.data) {
                current.next = first;
                first = first.next;
            } else {
                current.next = second;
                second = second.next;
            }

            current = current.next;
        }

        if (first != null) {
            current.next = first;
        } else {
            current.next = second;
        }

        current = dummy.next;

        System.out.print("Merged List: ");

        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
    }
}
