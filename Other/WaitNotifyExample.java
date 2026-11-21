
class Shared {

    synchronized void message() {

        System.out.println("Thread is waiting...");

        try {
            wait();
        } catch (InterruptedException e) {
            System.out.println("Interrupted");
        }

        System.out.println("Thread received notification!");
    }

    synchronized void notifyThread() {
        System.out.println("Sending notification...");
        notify();
    }
}

public class WaitNotifyExample {
    public static void main(String[] args) {

        Shared obj = new Shared();

        Thread t1 = new Thread(() -> obj.message());

        t1.start();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("Interrupted");
        }

        synchronized (obj) {
            obj.notifyThread();
        }
    }
}
