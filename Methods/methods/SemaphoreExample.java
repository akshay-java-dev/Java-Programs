
import java.util.concurrent.Semaphore;

public class SemaphoreExample {
    public static void main(String[] args) {
        Semaphore semaphore = new Semaphore(2);

        for (int i = 1; i <= 5; i++) {
            final int workerId = i;

            new Thread(() -> {
                boolean acquired = false;

                try {
                    semaphore.acquire();
                    acquired = true;

                    System.out.println(
                        "Worker " + workerId + " entered"
                    );

                    Thread.sleep(1000);

                    System.out.println(
                        "Worker " + workerId + " leaving"
                    );
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                } finally {
                    if (acquired) {
                        semaphore.release();
                    }
                }
            }).start();
        }
    }
}
