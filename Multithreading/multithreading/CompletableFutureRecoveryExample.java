
import java.util.concurrent.CompletableFuture;

public class CompletableFutureRecoveryExample {
    public static void main(String[] args) {

        CompletableFuture<Integer> future =
            CompletableFuture.supplyAsync(() -> {
                throw new RuntimeException("Something went wrong");
            });

        CompletableFuture<Integer> result =
            future.exceptionally(error -> {
                System.out.println("Error handled!");
                return 100;
            });

        System.out.println("Result: " + result.join());
    }
}
