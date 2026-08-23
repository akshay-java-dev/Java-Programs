class MyThr_1 implements Runnable {
    public void run() {
        System.out.println("I am a Thread running...");
    }
}

public class con_Thread_2 {
    public static void main(String[] args) {
        // Create a Runnable object
        MyThr_1 obj = new MyThr_1();

        // Create a Thread with a Runnable and a name
        Thread t = new Thread(obj, "AkshayThread");

        // Start the Thread
        t.start();

        // Print the thread name
        System.out.println("Thread name: " + t.getName());
    }
}
