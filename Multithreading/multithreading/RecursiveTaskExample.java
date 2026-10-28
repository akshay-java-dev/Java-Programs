
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

class ArraySumTask extends RecursiveTask<Integer> {
    private final int[] numbers;
    private final int start;
    private final int end;

    ArraySumTask(int[] numbers, int start, int end) {
        this.numbers = numbers;
        this.start = start;
        this.end = end;
    }

    protected Integer compute() {
        if (end - start <= 2) {
            int sum = 0;

            for (int i = start; i < end; i++) {
                sum += numbers[i];
            }

            return sum;
        }

        int mid = (start + end) / 2;

        ArraySumTask left =
                new ArraySumTask(numbers, start, mid);

        ArraySumTask right =
                new ArraySumTask(numbers, mid, end);

        left.fork();

        return right.compute() + left.join();
    }
}

public class RecursiveTaskExample {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};

        ForkJoinPool pool = new ForkJoinPool();

        try {
            int result = pool.invoke(
                    new ArraySumTask(numbers, 0, numbers.length)
            );

            System.out.println("Array sum: " + result);
        } finally {
            pool.shutdown();
        }
    }
}
