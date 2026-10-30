
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ExecutorShutdownExample {
    public static void main(String[] args)
            throws InterruptedException {

        ExecutorService executor =
            Executors.newFixedThreadPool(2);

        try {
            for (int i = 1; i <= 4; i++) {
                int taskId = i;

                executor.submit(() -> {
                    System.out.println(
                        "Task " + taskId + " completed"
                    );
                });
            }
        } finally {
            executor.shutdown();
        }

        if (!executor.awaitTermination(5, TimeUnit.SECONDS)) {
            executor.shutdownNow();
        }

        System.out.println("Executor stopped!");
    }
}
