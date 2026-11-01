
class SharedBuffer {
    private int data;
    private boolean available = false;

    public synchronized void produce(int value)
            throws InterruptedException {

        while (available) {
            wait();
        }

        data = value;
        available = true;

        System.out.println("Produced: " + data);
        notifyAll();
    }

    public synchronized int consume()
            throws InterruptedException {

        while (!available) {
            wait();
        }

        int value = data;
        available = false;

        System.out.println("Consumed: " + value);
        notifyAll();

        return value;
    }
}

public class ProducerConsumerWaitNotifyExample {
    public static void main(String[] args) {
        SharedBuffer buffer = new SharedBuffer();

        Thread producer = new Thread(() -> {
            try {
                for (int i = 1; i <= 5; i++) {
                    buffer.produce(i);
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });

        Thread consumer = new Thread(() -> {
            try {
                for (int i = 1; i <= 5; i++) {
                    buffer.consume();
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });

        producer.start();
        consumer.start();
    }
}
