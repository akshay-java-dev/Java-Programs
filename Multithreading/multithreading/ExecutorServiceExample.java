
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorServiceExample {
    public static void main(String[] args)
            throws Exception {
        ExecutorService executor =
                Executors.newSingleThreadExecutor();

        try {
            Callable<Integer> task = () -> {
                int a = 20;
                int b = 30;
                return a + b;
            };

            Future<Integer> result = executor.submit(task);

            System.out.println("Result: " + result.get());
        } finally {
            executor.shutdown();
        }
    }
}
