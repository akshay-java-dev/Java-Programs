
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

public class FutureTaskExample {
    public static void main(String[] args) throws Exception {
        Callable<String> task = () -> {
            Thread.sleep(1000);
            return "Task completed successfully!";
        };

        FutureTask<String> futureTask = new FutureTask<>(task);

        Thread thread = new Thread(futureTask);
        thread.start();

        System.out.println("Waiting for result...");
        System.out.println(futureTask.get());
    }
}
