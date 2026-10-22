
class Worker extends Thread {
    public void run() {
        for (int i = 1; i <= 3; i++) {
            System.out.println("Worker task: " + i);
        }
    }
}

public class ThreadJoinExample {
    public static void main(String[] args)
            throws InterruptedException {
        Worker t1 = new Worker();

        t1.start();
        t1.join();

        System.out.println("Worker finished!");
        System.out.println("Main continues.");
    }
}
