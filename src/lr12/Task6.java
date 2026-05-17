package lr12;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Task6 {
    public static void main(String[] args) {
        int[] array = {3, 8, 1, 14, 9, 5, 7, 2, 11, 6, 13, 4, 12, 10};
        int cores = Runtime.getRuntime().availableProcessors();
        System.out.println("Количество ядер процессора: " + cores);
        int sum = sumOfNums(array, cores);
        System.out.println("Сумма элементов: " + sum);
    }

    public static int sumOfNums(int[] array, int numThreads) {
        ExecutorService executor = Executors.newFixedThreadPool(numThreads);
        int[] results = new int[numThreads];
        int length = array.length;
        int chunkSize = (length + numThreads - 1) / numThreads;

        for (int i = 0; i < numThreads; i++) {
            final int threadIndex = i;
            final int start = i * chunkSize;
            final int end = Math.min(start + chunkSize, length);
            executor.submit(() -> {
                int sum = 0;
                for (int j = start; j < end; j++) {
                    sum += array[j];
                }
                results[threadIndex] = sum;
            });
        }

        executor.shutdown();
        try {
            executor.awaitTermination(1, TimeUnit.MINUTES);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        int totalSum = 0;
        for (int partialSum : results) {
            totalSum += partialSum;
        }
        return totalSum;
    }
}
