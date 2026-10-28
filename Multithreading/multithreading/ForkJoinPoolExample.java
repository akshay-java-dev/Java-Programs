
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

class SumTask extends RecursiveTask<Integer> {
    private final int start;
    private final int end;

    SumTask(int start, int end) {
        this.start = start;
        this.end = end;
    }

    protected Integer compute() {
        if (end - start <= 4) {
            int sum = 0;

            for (int i = start; i <= end; i++) {
                sum += i;
            }

            return sum;
        }

        int mid = (start + end) / 2;

        SumTask left = new SumTask(start, mid);
        SumTask right = new SumTask(mid + 1, end);

        left.fork();
        int rightResult = right.compute();
        int leftResult = left.join();

        return leftResult + rightResult;
    }
}

public class ForkJoinPoolExample {
    public static void main(String[] args) {
        ForkJoinPool pool = new ForkJoinPool();

        try {
            int result = pool.invoke(new SumTask(1, 10));
            System.out.println("Sum: " + result);
        } finally {
            pool.shutdown();
        }
    }
}
