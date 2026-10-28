
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduledExecutorServiceExample {
    public static void main(String[] args)
            throws InterruptedException {

        ScheduledExecutorService scheduler =
                Executors.newSingleThreadScheduledExecutor();

        Runnable task = () ->
                System.out.println("Task executed!");

        scheduler.scheduleAtFixedRate(
                task,
                0,
                2,
                TimeUnit.SECONDS
        );

        Thread.sleep(6500);

        scheduler.shutdown();
        scheduler.awaitTermination(2, TimeUnit.SECONDS);

        if (!scheduler.isTerminated()) {
            scheduler.shutdownNow();
        }

        System.out.println("Scheduler stopped.");
    }
}
