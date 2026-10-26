
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapExample {
    public static void main(String[] args)
            throws InterruptedException {
        ConcurrentHashMap<String, Integer> scores =
                new ConcurrentHashMap<>();

        Thread t1 = new Thread(() -> {
            scores.put("Akshay", 90);
            scores.put("Rahul", 85);
        });

        Thread t2 = new Thread(() -> {
            scores.put("Priya", 95);
            scores.put("Amit", 88);
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        scores.forEach((name, score) ->
                System.out.println(name + ": " + score));
    }
}
