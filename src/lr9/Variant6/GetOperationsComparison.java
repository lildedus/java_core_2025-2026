package lr9.Variant6;

import java.util.*;

public class GetOperationsComparison {

    public static void main(String[] args) {
        int collectionSize = 600000;
        int operations = 600000;

        System.out.println("=== СРАВНЕНИЕ ОПЕРАЦИЙ ПОЛУЧЕНИЯ ПО ИНДЕКСУ ===");
        System.out.println("Размер коллекции: " + collectionSize);
        System.out.println("Количество операций: " + operations);
        System.out.println("=".repeat(60));

        System.out.printf("%-15s %-25s%n", "Коллекция", "Время (мс)");
        System.out.println("-".repeat(40));

        long arrayListGet = testArrayListGet(collectionSize, operations);
        System.out.printf("%-15s %-25d%n", "ArrayList", arrayListGet);

        long linkedListGet = testLinkedListGet(collectionSize, operations);
        System.out.printf("%-15s %-25d%n", "LinkedList", linkedListGet);

        long linkedHashMapGet = testLinkedHashMapGet(collectionSize, operations);
        System.out.printf("%-15s %-25d%n", "LinkedHashMap", linkedHashMapGet);
    }

    public static long testArrayListGet(int size, int operations) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < size; i++) list.add(i);

        Random random = new Random(123);
        long start = System.currentTimeMillis();
        for (int i = 0; i < operations; i++) {
            list.get(random.nextInt(size));
        }
        return System.currentTimeMillis() - start;
    }

    public static long testLinkedListGet(int size, int operations) {
        List<Integer> list = new LinkedList<>();
        for (int i = 0; i < size; i++) list.add(i);

        Random random = new Random(123);
        long start = System.currentTimeMillis();
        for (int i = 0; i < operations; i++) {
            list.get(random.nextInt(size));
        }
        return System.currentTimeMillis() - start;
    }

    public static long testLinkedHashMapGet(int size, int operations) {
        Map<Integer, String> map = new LinkedHashMap<>();
        for (int i = 0; i < size; i++) map.put(i, "Value" + i);

        Random random = new Random(123);
        long start = System.currentTimeMillis();
        for (int i = 0; i < operations; i++) {
            map.get(random.nextInt(size));
        }
        return System.currentTimeMillis() - start;
    }
}