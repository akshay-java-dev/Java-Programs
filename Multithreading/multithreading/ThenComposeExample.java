
import java.util.concurrent.CompletableFuture;

public class ThenComposeExample {
    public static void main(String[] args) {

        CompletableFuture<Integer> future =
            CompletableFuture.supplyAsync(() -> 10);

        CompletableFuture<Integer> result =
            future.thenCompose(number ->
                CompletableFuture.supplyAsync(() -> number * 5)
            );

        System.out.println("Final result: " + result.join());
    }
}
