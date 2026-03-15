package lr9.Variant6;

import java.util.*;

public class AddOperationsComparison {

    public static void main(String[] args) {
        int collectionSize = 600000;
        int operations = 60000;

        System.out.println("=== СРАВНЕНИЕ ОПЕРАЦИЙ ДОБАВЛЕНИЯ ===");
        System.out.println("Размер коллекции: " + collectionSize);
        System.out.println("Количество операций: " + operations);
        System.out.println("=".repeat(70));

        System.out.printf("%-15s %-20s %-20s %-20s%n",
                "Коллекция", "В начало", "В середину", "В конец");
        System.out.println("-".repeat(75));

        // ArrayList
        long arrayListAddFirst = testArrayListAddFirst(collectionSize, operations);
        long arrayListAddMiddle = testArrayListAddMiddle(collectionSize, operations);
        long arrayListAddLast = testArrayListAddLast(collectionSize, operations);
        System.out.printf("%-15s %-20d %-20d %-20d%n",
                "ArrayList", arrayListAddFirst, arrayListAddMiddle, arrayListAddLast);

        // LinkedList
        long linkedListAddFirst = testLinkedListAddFirst(collectionSize, operations);
        long linkedListAddMiddle = testLinkedListAddMiddle(collectionSize, operations);
        long linkedListAddLast = testLinkedListAddLast(collectionSize, operations);
        System.out.printf("%-15s %-20d %-20d %-20d%n",
                "LinkedList", linkedListAddFirst, linkedListAddMiddle, linkedListAddLast);

        // LinkedHashMap
        long linkedHashMapAddLast = testLinkedHashMapAddLast(collectionSize, operations);
        System.out.printf("%-15s %-20s %-20s %-20d%n",
                "LinkedHashMap", "N/A", "N/A", linkedHashMapAddLast);
    }

    // ArrayList тесты
    public static long testArrayListAddFirst(int size, int operations) {
        List<Integer> list = new ArrayList<>(size);
        for (int i = 0; i < size; i++) list.add(i);

        long start = System.nanoTime();
        for (int i = 0; i < operations; i++) {
            list.add(0, i);
        }
        return (System.nanoTime() - start) / 1_000_000;
    }

    public static long testArrayListAddMiddle(int size, int operations) {
        List<Integer> list = new ArrayList<>(size);
        for (int i = 0; i < size; i++) list.add(i);

        long start = System.nanoTime();
        for (int i = 0; i < operations; i++) {
            list.add(list.size() / 2, i);
        }
        return (System.nanoTime() - start) / 1_000_000;
    }

    public static long testArrayListAddLast(int size, int operations) {
        List<Integer> list = new ArrayList<>(size);
        for (int i = 0; i < size; i++) list.add(i);

        long start = System.nanoTime();
        for (int i = 0; i < operations; i++) {
            list.add(i);
        }
        return (System.nanoTime() - start) / 1_000_000;
    }

    // LinkedList тесты
    public static long testLinkedListAddFirst(int size, int operations) {
        List<Integer> list = new LinkedList<>();
        for (int i = 0; i < size; i++) list.add(i);

        long start = System.nanoTime();
        for (int i = 0; i < operations; i++) {
            list.add(0, i);
        }
        return (System.nanoTime() - start) / 1_000_000;
    }

    public static long testLinkedListAddMiddle(int size, int operations) {
        List<Integer> list = new LinkedList<>();
        for (int i = 0; i < size; i++) list.add(i);

        long start = System.nanoTime();
        for (int i = 0; i < operations; i++) {
            list.add(list.size() / 2, i);
        }
        return (System.nanoTime() - start) / 1_000_000;
    }

    public static long testLinkedListAddLast(int size, int operations) {
        List<Integer> list = new LinkedList<>();
        for (int i = 0; i < size; i++) list.add(i);

        long start = System.nanoTime();
        for (int i = 0; i < operations; i++) {
            list.add(i);
        }
        return (System.nanoTime() - start) / 1_000_000;
    }

    // LinkedHashMap тест (только добавление в конец)
    public static long testLinkedHashMapAddLast(int size, int operations) {
        Map<Integer, String> map = new LinkedHashMap<>(size);
        for (int i = 0; i < size; i++) map.put(i, "Value" + i);

        long start = System.nanoTime();
        for (int i = 0; i < operations; i++) {
            map.put(size + i, "Last" + i);
        }
        return (System.nanoTime() - start) / 1_000_000;
    }
}