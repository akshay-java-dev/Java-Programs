
class MyWorker extends Thread {

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Worker: " + i);
        }
    }
}

public class ThreadJoinExample {
    public static void main(String[] args) {

        MyWorker t1 = new MyWorker();

        t1.start();

        try {
            t1.join();
        } catch (InterruptedException e) {
            System.out.println("Interrupted");
        }

        System.out.println("Main thread completed");
    }
}
