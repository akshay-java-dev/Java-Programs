class MyThreadRunnable_1 implements Runnable {
    public void run() {
        int i = 1;
        while (i < 2) {
            System.out.println("The Phone is Ringing.......");
            i++;
        }
    }
}

class MyThreadRunnable_2 implements Runnable {
    public void run() {
        int i = 1;
        while (i < 2) {
            System.out.println("The Girl is Singing the Song");
            i++;
        }
    }
}

class MyThreadRunnable_3 implements Runnable {
    public void run() {
        int i = 1;
        while (i < 2) {
            System.out.println("The Boy is Playing in the Ground");
            i++;
        }
    }
}

public class runnable_2 {
    public static void main(String[] args) {
        MyThreadRunnable_1 R1 = new MyThreadRunnable_1();
        Thread T1 = new Thread(R1);

        MyThreadRunnable_2 R2 = new MyThreadRunnable_2();
        Thread T2 = new Thread(R2);

        MyThreadRunnable_3 R3 = new MyThreadRunnable_3();
        Thread T3 = new Thread(R3);

        T1.start();
        T2.start();
        T3.start();
    }
}
