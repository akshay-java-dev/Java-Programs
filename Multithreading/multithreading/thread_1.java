class MyThread extends Thread {
    public void run() {
        while (true) {
            System.out.println("My Thread is running....");
            System.out.println("I Am Happy");
        }
    }
}

class MyThread2 extends Thread {
    public void run() {
        while (true) {
            System.out.println("My Thread is good");
            System.out.println("I Am Sad");
        }
    }
}

public class thread_1 {
    public static void main(String[] args) {
        MyThread t = new MyThread();
        MyThread2 tt = new MyThread2();
        t.start();
        tt.start();
    }
}
