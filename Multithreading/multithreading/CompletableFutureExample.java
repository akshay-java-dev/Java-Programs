
import java.util.concurrent.CompletableFuture;

public class CompletableFutureExample {
    public static void main(String[] args) {
        CompletableFuture<Integer> future =
                CompletableFuture.supplyAsync(() -> 10 + 20);

        future.thenApply(result -> result * 2)
              .thenAccept(result ->
                  System.out.println("Final result: " + result))
              .join();
    }
}
