
class Message {
    private boolean ready = false;

    public synchronized void receive() {
        while (!ready) {
            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                return;
            }
        }

        System.out.println("Message received!");
    }

    public synchronized void send() {
        ready = true;
        System.out.println("Message sent!");
        notify();
    }
}

public class WaitNotifyExample {
    public static void main(String[] args)
            throws InterruptedException {
        Message message = new Message();

        Thread receiver = new Thread(message::receive);
        receiver.start();

        Thread.sleep(500);

        synchronized (message) {
            message.send();
        }

        receiver.join();
    }
}
