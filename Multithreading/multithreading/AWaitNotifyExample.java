
class SharedMessage {
    private boolean available = false;

    public synchronized void produce() {
        System.out.println("Producing message...");
        available = true;
        notify();
    }

    public synchronized void consume() {
        while (!available) {
            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                return;
            }
        }

        System.out.println("Message consumed!");
    }
}

public class WaitNotifyExample {
    public static void main(String[] args) {
        SharedMessage message = new SharedMessage();

        Thread consumer = new Thread(message::consume);
        Thread producer = new Thread(message::produce);

        consumer.start();
        producer.start();
    }
}
