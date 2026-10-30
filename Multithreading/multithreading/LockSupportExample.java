
import java.util.concurrent.locks.LockSupport;

public class LockSupportExample {
    public static void main(String[] args)
            throws InterruptedException {

        Thread worker = new Thread(() -> {
            System.out.println("Worker started");

            LockSupport.park();

            System.out.println("Worker resumed");
        });

        worker.start();

        Thread.sleep(1000);

        System.out.println("Main thread unpark worker");

        LockSupport.unpark(worker);

        worker.join();

        System.out.println("Program completed");
    }
}
