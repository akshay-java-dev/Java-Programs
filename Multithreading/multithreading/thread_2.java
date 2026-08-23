class nameThread extends Thread {
    public void run() {
        int i = 1;
        while (i <= 2) {
            System.out.println("Akshay");
            System.out.println("Kumbhar");
            i++;
        }
    }
}

class frdThread extends Thread {
    public void run() {
        int i = 1;
        while (i <= 2) {
            System.out.println("Karan");
            i++;
        }
    }
}

public class thread_2 {
    public static void main(String[] args) {
        nameThread n = new nameThread();   // ✅ Thread 1 object
        frdThread f = new frdThread();     // ✅ Thread 2 object
        n.start();                         // ✅ start() calls run()
        f.start();                         // ✅ start() calls run()
    }
}
