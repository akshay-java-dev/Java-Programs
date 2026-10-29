
import java.util.concurrent.CompletableFuture;

public class CompletableFutureThenCombineExample {
    public static void main(String[] args) {
        CompletableFuture<Integer> first =
                CompletableFuture.supplyAsync(() -> 20);

        CompletableFuture<Integer> second =
                CompletableFuture.supplyAsync(() -> 30);

        CompletableFuture<Integer> combined =
                first.thenCombine(second, Integer::sum);

        System.out.println("Combined result: " + combined.join());
    }
}
