
import java.util.concurrent.Phaser;

public class PhaserExample {
    public static void main(String[] args) {
        Phaser phaser = new Phaser(2);

        for (int i = 1; i <= 2; i++) {
            final int id = i;

            new Thread(() -> {
                System.out.println("Worker " + id + " - Phase 1");
                phaser.arriveAndAwaitAdvance();

                System.out.println("Worker " + id + " - Phase 2");
                phaser.arriveAndAwaitAdvance();

                System.out.println("Worker " + id + " finished");
                phaser.arriveAndDeregister();
            }).start();
        }
    }
}
