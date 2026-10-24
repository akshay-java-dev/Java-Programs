
class DeadlockPreventionExample {
    private static final Object LOCK_A = new Object();
    private static final Object LOCK_B = new Object();

    static void performTask(String name) {
        synchronized (LOCK_A) {
            System.out.println(name + " acquired LOCK_A");

            synchronized (LOCK_B) {
                System.out.println(name + " acquired LOCK_B");
            }
        }
    }

    public static void main(String[] args) {
        Thread t1 = new Thread(
            () -> performTask("Thread 1")
        );

        Thread t2 = new Thread(
            () -> performTask("Thread 2")
        );

        t1.start();
        t2.start();
    }
}
