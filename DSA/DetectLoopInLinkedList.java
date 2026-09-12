public class DetectLoopInLinkedList {

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

        // Creating a loop
        fourth.next = second;

        Node slow = first;
        Node fast = first;

        boolean loopFound = false;

        while (fast != null && fast.next != null) {

            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                loopFound = true;
                break;
            }
        }

        if (loopFound) {
            System.out.println("Loop Found");
        } else {
            System.out.println("No Loop");
        }
    }
}
