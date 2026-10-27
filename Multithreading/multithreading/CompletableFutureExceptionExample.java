
import java.util.concurrent.CompletableFuture;

public class CompletableFutureExceptionExample {
    public static void main(String[] args) {
        CompletableFuture<Integer> future =
            CompletableFuture.supplyAsync(() -> {
                if (true) {
                    throw new RuntimeException("Something went wrong");
                }
                return 100;
            });

        future.exceptionally(error -> {
            System.out.println("Error: " + error.getMessage());
            return 0;
        }).thenAccept(result ->
            System.out.println("Result: " + result)
        ).join();
    }
}
