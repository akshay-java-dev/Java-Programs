
class SharedResource {
    public synchronized void waitForSignal() {
        try {
            System.out.println(
                Thread.currentThread().getName() + " is waiting"
            );

            wait();

            System.out.println(
                Thread.currentThread().getName() + " resumed"
            );

        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    public synchronized void sendSignal() {
        System.out.println("Sending signal to all threads");
        notifyAll();
    }
}

public class NotifyAllExample {
    public static void main(String[] args)
            throws InterruptedException {

        SharedResource resource = new SharedResource();

        Thread t1 = new Thread(resource::waitForSignal, "Thread 1");
        Thread t2 = new Thread(resource::waitForSignal, "Thread 2");

        t1.start();
        t2.start();

        Thread.sleep(500);

        synchronized (resource) {
            resource.sendSignal();
        }

        t1.join();
        t2.join();
    }
}
