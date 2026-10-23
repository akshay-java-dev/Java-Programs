
class Worker implements Runnable {
    private volatile boolean running = true;

    public void run() {
        System.out.println("Worker started");

        while (running) {
            Thread.yield();
        }

        System.out.println("Worker stopped");
    }

    public void stopWorker() {
        running = false;
    }
}

public class VolatileExample {
    public static void main(String[] args)
            throws InterruptedException {
        Worker worker = new Worker();
        Thread t1 = new Thread(worker);

        t1.start();

        Thread.sleep(1000);
        worker.stopWorker();

        t1.join();

        System.out.println("Main thread finished");
    }
}
