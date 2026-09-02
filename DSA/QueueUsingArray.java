public class QueueUsingArray {

    static int[] queue = new int[5];
    static int front = 0;
    static int rear = -1;

    static void enqueue(int value) {

        if (rear == queue.length - 1) {
            System.out.println("Queue is full");
            return;
        }

        queue[++rear] = value;
    }

    static void dequeue() {

        if (front > rear) {
            System.out.println("Queue is empty");
            return;
        }

        System.out.println("Removed: " + queue[front++]);
    }

    static void display() {

        System.out.print("Queue: ");

        for (int i = front; i <= rear; i++) {
            System.out.print(queue[i] + " ");
        }

        System.out.println();
    }

    public static void main(String[] args) {

        enqueue(10);
        enqueue(20);
        enqueue(30);

        display();

        dequeue();

        display();
    }
}
