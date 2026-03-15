package lr9.Variant6;

import java.util.*;

public class RemoveOperationsComparison {

    public static void main(String[] args) {
        int collectionSize = 60000;
        int operations = 60000;

        System.out.println("=== СРАВНЕНИЕ ОПЕРАЦИЙ УДАЛЕНИЯ ===");
        System.out.println("Размер коллекции: " + collectionSize);
        System.out.println("Количество операций: " + operations);
        System.out.println("=".repeat(70));

        System.out.printf("%-15s %-20s %-20s %-20s%n",
                "Коллекция", "С начала", "Из середины", "С конца");
        System.out.println("-".repeat(75));

        // ArrayList
        long arrayListRemoveFirst = testArrayListRemoveFirst(collectionSize, operations);
        long arrayListRemoveMiddle = testArrayListRemoveMiddle(collectionSize, operations);
        long arrayListRemoveLast = testArrayListRemoveLast(collectionSize, operations);
        System.out.printf("%-15s %-20d %-20d %-20d%n",
                "ArrayList", arrayListRemoveFirst, arrayListRemoveMiddle, arrayListRemoveLast);

        // LinkedList
        long linkedListRemoveFirst = testLinkedListRemoveFirst(collectionSize, operations);
        long linkedListRemoveMiddle = testLinkedListRemoveMiddle(collectionSize, operations);
        long linkedListRemoveLast = testLinkedListRemoveLast(collectionSize, operations);
        System.out.printf("%-15s %-20d %-20d %-20d%n",
                "LinkedList", linkedListRemoveFirst, linkedListRemoveMiddle, linkedListRemoveLast);

        // LinkedHashMap
        long linkedHashMapRemoveFirst = testLinkedHashMapRemoveFirst(collectionSize, operations);
        long linkedHashMapRemoveMiddle = testLinkedHashMapRemoveMiddle(collectionSize, operations);
        long linkedHashMapRemoveLast = testLinkedHashMapRemoveLast(collectionSize, operations);
        System.out.printf("%-15s %-20d %-20d %-20d%n",
                "LinkedHashMap", linkedHashMapRemoveFirst, linkedHashMapRemoveMiddle, linkedHashMapRemoveLast);
    }

    // ArrayList тесты
    public static long testArrayListRemoveFirst(int size, int operations) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < size + operations; i++) list.add(i);

        long start = System.currentTimeMillis();
        for (int i = 0; i < operations; i++) {
            list.remove(0);
        }
        return System.currentTimeMillis() - start;
    }

    public static long testArrayListRemoveMiddle(int size, int operations) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < size + operations; i++) list.add(i);

        long start = System.currentTimeMillis();
        for (int i = 0; i < operations; i++) {
            list.remove(list.size() / 2);
        }
        return System.currentTimeMillis() - start;
    }

    public static long testArrayListRemoveLast(int size, int operations) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < size + operations; i++) list.add(i);

        long start = System.currentTimeMillis();
        for (int i = 0; i < operations; i++) {
            list.remove(list.size() - 1);
        }
        return System.currentTimeMillis() - start;
    }

    // LinkedList тесты
    public static long testLinkedListRemoveFirst(int size, int operations) {
        List<Integer> list = new LinkedList<>();
        for (int i = 0; i < size + operations; i++) list.add(i);

        long start = System.currentTimeMillis();
        for (int i = 0; i < operations; i++) {
            list.remove(0);
        }
        return System.currentTimeMillis() - start;
    }

    public static long testLinkedListRemoveMiddle(int size, int operations) {
        List<Integer> list = new LinkedList<>();
        for (int i = 0; i < size + operations; i++) list.add(i);

        long start = System.currentTimeMillis();
        for (int i = 0; i < operations; i++) {
            list.remove(list.size() / 2);
        }
        return System.currentTimeMillis() - start;
    }

    public static long testLinkedListRemoveLast(int size, int operations) {
        List<Integer> list = new LinkedList<>();
        for (int i = 0; i < size + operations; i++) list.add(i);

        long start = System.currentTimeMillis();
        for (int i = 0; i < operations; i++) {
            list.remove(list.size() - 1);
        }
        return System.currentTimeMillis() - start;
    }

    // LinkedHashMap тесты
    public static long testLinkedHashMapRemoveFirst(int size, int operations) {
        Map<Integer, String> map = new LinkedHashMap<>();
        for (int i = 0; i < size + operations; i++) map.put(i, "Value" + i);

        long start = System.currentTimeMillis();
        for (int i = 0; i < operations; i++) {
            Integer firstKey = map.keySet().iterator().next();
            map.remove(firstKey);
        }
        return System.currentTimeMillis() - start;
    }

    public static long testLinkedHashMapRemoveMiddle(int size, int operations) {
        Map<Integer, String> map = new LinkedHashMap<>();
        for (int i = 0; i < size + operations; i++) map.put(i, "Value" + i);

        long start = System.currentTimeMillis();
        for (int i = 0; i < operations; i++) {
            List<Integer> keys = new ArrayList<>(map.keySet());
            if (!keys.isEmpty()) {
                int middleIndex = keys.size() / 2;
                map.remove(keys.get(middleIndex));
            }
        }
        return System.currentTimeMillis() - start;
    }

    public static long testLinkedHashMapRemoveLast(int size, int operations) {
        Map<Integer, String> map = new LinkedHashMap<>();
        for (int i = 0; i < size + operations; i++) map.put(i, "Value" + i);

        long start = System.currentTimeMillis();
        for (int i = 0; i < operations; i++) {
            List<Integer> keys = new ArrayList<>(map.keySet());
            if (!keys.isEmpty()) {
                map.remove(keys.get(keys.size() - 1));
            }
        }
        return System.currentTimeMillis() - start;
    }
}