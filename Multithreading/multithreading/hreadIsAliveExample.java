
class AliveWorker extends Thread {
    public void run() {
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            return;
        }

        System.out.println("Worker completed.");
    }
}

public class ThreadIsAliveExample {
    public static void main(String[] args)
            throws InterruptedException {
        AliveWorker t1 = new AliveWorker();

        System.out.println("Before start: " + t1.isAlive());

        t1.start();

        System.out.println("After start: " + t1.isAlive());

        t1.join();

        System.out.println("After completion: " + t1.isAlive());
    }
}
