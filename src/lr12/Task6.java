package lr12;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;

public class Task6 {
    static void main() throws InterruptedException {
        int[] arr = new Random().ints(10, 1, 100) .peek((n) -> System.out.print(n + " ")).toArray();
        System.out.println("\nSum: " + getSum(arr));
    }

    static int getSum(int[] arr) throws InterruptedException {
        int cores = Runtime.getRuntime().availableProcessors();
        if (cores > arr.length) cores = arr.length;

        Thread[] threads = new Thread[cores];
        int[] localSums = IntStream.generate(() -> 0).limit(cores).toArray();

        for (int i = 0, chunkSize = arr.length / cores; i < cores; i++) {
            final int start = chunkSize * i;
            final int end = (i == cores - 1) ? arr.length : (start + chunkSize);
            final int finalI = i;

            threads[i] = new Thread(() -> {
                for (int j = start; j < end; j++) localSums[finalI] += arr[j];
            });
            threads[i].start();
        }
        for (Thread thread : threads) thread.join();
        return Arrays.stream(localSums).sum();
    }
}
