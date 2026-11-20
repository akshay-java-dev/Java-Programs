
class PriorityThread extends Thread {

    public PriorityThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println(
            getName() + " | Priority: " + getPriority()
        );
    }
}

public class ThreadPriorityExample {
    public static void main(String[] args) {

        PriorityThread t1 = new PriorityThread("Low Priority");
        PriorityThread t2 = new PriorityThread("Normal Priority");
        PriorityThread t3 = new PriorityThread("High Priority");

        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.NORM_PRIORITY);
        t3.setPriority(Thread.MAX_PRIORITY);

        t1.start();
        t2.start();
        t3.start();
    }
}
