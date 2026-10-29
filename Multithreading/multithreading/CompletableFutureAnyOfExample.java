
import java.util.concurrent.CompletableFuture;

public class CompletableFutureAnyOfExample {
    public static void main(String[] args) {
        CompletableFuture<String> task1 =
                CompletableFuture.supplyAsync(() -> {
                    sleep(1000);
                    return "Task 1 result";
                });

        CompletableFuture<String> task2 =
                CompletableFuture.supplyAsync(() -> {
                    sleep(300);
                    return "Task 2 result";
                });

        CompletableFuture<Object> first =
                CompletableFuture.anyOf(task1, task2);

        System.out.println("First result: " + first.join());
    }

    private static void sleep(long milliseconds) {
        try {
            Thread.sleep(milliseconds);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            throw new RuntimeException(e);
        }
    }
}
