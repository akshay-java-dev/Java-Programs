
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableFutureExample {
    public static void main(String[] args) throws Exception {
        ExecutorService executor =
                Executors.newSingleThreadExecutor();

        try {
            Callable<Integer> task = () -> {
                int a = 25;
                int b = 35;
                return a + b;
            };

            Future<Integer> future = executor.submit(task);

            System.out.println("Result: " + future.get());
        } finally {
            executor.shutdown();
        }
    }
}
