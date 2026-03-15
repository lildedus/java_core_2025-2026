package lr9.Task7;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        int[] testSizes = {10000, 50000, 100000, 200000};
        System.out.printf("%-15s %-20s %-20s %-15s%n",
                "Размер N", "ArrayList (мс)", "LinkedList (мс)", "Победитель");
        System.out.println();
        for (int N : testSizes) {
            long arrayListTime = measureArrayList(N);
            long linkedListTime = measureLinkedList(N);

            String winner = (arrayListTime < linkedListTime) ? "ArrayList" : "LinkedList";

            System.out.printf("%-15d %-20d %-20d %-15s%n",
                    N, arrayListTime, linkedListTime, winner);
        }
    }

    public static long measureArrayList(int N) {
        long start = System.currentTimeMillis();

        List<Integer> people = new ArrayList<>();
        for (int i = 1; i <= N; i++) {
            people.add(i);
        }

        int index = 0;
        while (people.size() > 1) {
            index = (index + 1) % people.size();
            people.remove(index);
        }

        long end = System.currentTimeMillis();
        return end - start;
    }

    public static long measureLinkedList(int N) {
        long start = System.currentTimeMillis();

        List<Integer> people = new LinkedList<>();
        for (int i = 1; i <= N; i++) {
            people.add(i);
        }

        int index = 0;
        while (people.size() > 1) {
            index = (index + 1) % people.size();
            people.remove(index);
        }

        long end = System.currentTimeMillis();
        return end - start;
    }
}