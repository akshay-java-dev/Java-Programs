
public class ThreadCancellationExample {
    public static void main(String[] args)
            throws InterruptedException {

        Thread worker = new Thread(() -> {
            try {
                while (!Thread.currentThread().isInterrupted()) {
                    System.out.println("Worker is running...");
                    Thread.sleep(500);
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }

            System.out.println("Worker stopped!");
        });

        worker.start();

        Thread.sleep(1500);

        System.out.println("Cancelling worker...");
        worker.interrupt();

        worker.join();

        System.out.println("Main thread completed!");
    }
}
