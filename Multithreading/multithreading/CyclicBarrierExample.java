
import java.util.concurrent.CyclicBarrier;

public class CyclicBarrierExample {
    public static void main(String[] args) {
        CyclicBarrier barrier = new CyclicBarrier(2, () ->
            System.out.println("Both workers are ready!")
        );

        for (int i = 1; i <= 2; i++) {
            final int id = i;

            new Thread(() -> {
                try {
                    System.out.println("Worker " + id + " is working");
                    Thread.sleep(id * 500L);

                    System.out.println("Worker " + id + " is waiting");
                    barrier.await();

                    System.out.println("Worker " + id + " continues");
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }).start();
        }
    }
}
