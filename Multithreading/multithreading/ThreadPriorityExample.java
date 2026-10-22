
class PriorityTask extends Thread {
    public PriorityTask(String name) {
        super(name);
    }

    public void run() {
        System.out.println(
            getName() + " | Priority: " + getPriority()
        );
    }
}

public class ThreadPriorityExample {
    public static void main(String[] args) {
        PriorityTask t1 = new PriorityTask("Low Priority");
        PriorityTask t2 = new PriorityTask("Normal Priority");
        PriorityTask t3 = new PriorityTask("High Priority");

        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.NORM_PRIORITY);
        t3.setPriority(Thread.MAX_PRIORITY);

        t1.start();
        t2.start();
        t3.start();
    }
}
