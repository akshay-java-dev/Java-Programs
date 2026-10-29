
import java.util.concurrent.CompletableFuture;

public class CompletableFutureAllOfExample {
    public static void main(String[] args) {
        CompletableFuture<Void> task1 =
                CompletableFuture.runAsync(
                        () -> System.out.println("Task 1 completed"));

        CompletableFuture<Void> task2 =
                CompletableFuture.runAsync(
                        () -> System.out.println("Task 2 completed"));

        CompletableFuture<Void> task3 =
                CompletableFuture.runAsync(
                        () -> System.out.println("Task 3 completed"));

        CompletableFuture.allOf(task1, task2, task3).join();

        System.out.println("All tasks completed!");
    }
}
