
class AliveThread extends Thread {

    @Override
    public void run() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println("Interrupted");
        }

        System.out.println("Thread task completed");
    }
}

public class ThreadIsAliveExample {
    public static void main(String[] args) {

        AliveThread t1 = new AliveThread();

        System.out.println("Before start: " + t1.isAlive());

        t1.start();

        System.out.println("After start: " + t1.isAlive());

        try {
            t1.join();
        } catch (InterruptedException e) {
            System.out.println("Interrupted");
        }

        System.out.println("After completion: " + t1.isAlive());
    }
}
