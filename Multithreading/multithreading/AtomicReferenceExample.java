
import java.util.concurrent.atomic.AtomicReference;

public class AtomicReferenceExample {
    public static void main(String[] args) {

        AtomicReference<String> status =
                new AtomicReference<>("Pending");

        System.out.println("Before: " + status.get());

        status.set("Processing");

        System.out.println("After update: " + status.get());

        boolean updated =
                status.compareAndSet("Processing", "Completed");

        System.out.println("Updated: " + updated);
        System.out.println("Final status: " + status.get());
    }
}
