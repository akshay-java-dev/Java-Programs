
public class ThreadLifecycleExample {
    public static void main(String[] args)
            throws InterruptedException {
        Thread t1 = new Thread(() -> {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });

        System.out.println("Before start: " + t1.getState());

        t1.start();

        System.out.println("After start: " + t1.getState());

        Thread.sleep(200);

        System.out.println("During sleep: " + t1.getState());

        t1.join();

        System.out.println("After completion: " + t1.getState());
    }
}
