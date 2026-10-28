
public class ThreadLocalExample {
    private static final ThreadLocal<Integer> userId =
            ThreadLocal.withInitial(() -> 0);

    public static void main(String[] args)
            throws InterruptedException {

        Thread t1 = new Thread(() -> {
            userId.set(101);
            System.out.println("Thread 1 ID: " + userId.get());
            userId.remove();
        });

        Thread t2 = new Thread(() -> {
            userId.set(202);
            System.out.println("Thread 2 ID: " + userId.get());
            userId.remove();
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();
    }
}
