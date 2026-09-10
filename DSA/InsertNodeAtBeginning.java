public class InsertNodeAtBeginning {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static void main(String[] args) {

        Node first = new Node(20);
        Node second = new Node(30);

        first.next = second;

        Node newNode = new Node(10);

        newNode.next = first;
        first = newNode;

        Node current = first;

        System.out.print("Linked List: ");

        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
    }
}
