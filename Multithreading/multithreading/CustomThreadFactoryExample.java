
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

public class CustomThreadFactoryExample {
    public static void main(String[] args) {

        ThreadFactory factory = new ThreadFactory() {
            private int count = 1;

            public Thread newThread(Runnable task) {
                return new Thread(
                    task, "Custom-Thread-" + count++
                );
            }
        };

        ExecutorService executor =
                Executors.newFixedThreadPool(2, factory);

        try {
            for (int i = 1; i <= 4; i++) {
                final int taskId = i;

                executor.submit(() ->
                    System.out.println(
                        "Task " + taskId + " executed by "
                        + Thread.currentThread().getName()
                    )
                );
            }
        } finally {
            executor.shutdown();
        }
    }
}
