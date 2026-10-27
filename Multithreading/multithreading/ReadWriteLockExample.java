
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

class SharedData {
    private int value = 0;

    private final ReadWriteLock lock =
        new ReentrantReadWriteLock();

    public void write(int newValue) {
        lock.writeLock().lock();
        try {
            value = newValue;
            System.out.println("Written: " + value);
        } finally {
            lock.writeLock().unlock();
        }
    }

    public int read() {
        lock.readLock().lock();
        try {
            System.out.println("Read: " + value);
            return value;
        } finally {
            lock.readLock().unlock();
        }
    }
}

public class ReadWriteLockExample {
    public static void main(String[] args) {
        SharedData data = new SharedData();

        Thread writer = new Thread(() -> data.write(100));
        Thread reader = new Thread(data::read);

        writer.start();
        reader.start();
    }
}
