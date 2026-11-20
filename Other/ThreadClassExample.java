
class MyThread extends Thread {

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Thread: " + i);
        }
    }
}

public class ThreadClassExample {
    public static void main(String[] args) {

        MyThread t1 = new MyThread();

        t1.start();

        System.out.println("Main thread is running");
    }
}
