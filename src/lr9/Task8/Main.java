package lr9.Task8;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== ТЕСТИРОВАНИЕ ОДНОСВЯЗНОГО СПИСКА ===\n");

        LinkedListCustom list = new LinkedListCustom();
        int[] testData = {10, 20, 30, 40, 50};

        // Тест создания с головы
        System.out.println("1. Создание списка с головы (createHead):");
        list.createHead(testData);
        System.out.println("   Результат: " + list.toString());

        // Тест создания с хвоста
        System.out.println("\n2. Создание списка с хвоста (createTail):");
        list.createTail(testData);
        System.out.println("   Результат: " + list.toString());

        // Тест добавления в начало
        System.out.println("\n3. Добавление элемента в начало (addFirst):");
        list.addFirst(5);
        System.out.println("   Добавили 5 в начало: " + list.toString());

        // Тест добавления в конец
        System.out.println("\n4. Добавление элемента в конец (addLast):");
        list.addLast(60);
        System.out.println("   Добавили 60 в конец: " + list.toString());

        // Тест вставки по позиции
        System.out.println("\n5. Вставка элемента по позиции (insert):");
        list.insert(25, 3);
        System.out.println("   Вставили 25 на позицию 3: " + list.toString());

        // Тест удаления с начала
        System.out.println("\n6. Удаление элемента с начала (removeFirst):");
        int removedFirst = list.removeFirst();
        System.out.println("   Удален элемент: " + removedFirst);
        System.out.println("   Результат: " + list.toString());

        // Тест удаления с конца
        System.out.println("\n7. Удаление элемента с конца (removeLast):");
        int removedLast = list.removeLast();
        System.out.println("   Удален элемент: " + removedLast);
        System.out.println("   Результат: " + list.toString());

        // Тест удаления по позиции
        System.out.println("\n8. Удаление элемента по позиции (remove):");
        int removedPos = list.remove(2);
        System.out.println("   Удален элемент с позиции 2: " + removedPos);
        System.out.println("   Результат: " + list.toString());

        // Тест рекурсивного создания с головы
        System.out.println("\n9. Рекурсивное создание с головы (createHeadRec):");
        list.createHeadRec(new int[]{100, 200, 300, 400});
        System.out.println("   Результат: " + list.toStringRec());

        // Тест рекурсивного создания с хвоста
        System.out.println("\n10. Рекурсивное создание с хвоста (createTailRec):");
        list.createTailRec(new int[]{1, 2, 3, 4, 5});
        System.out.println("   Результат: " + list.toStringRec());

        System.out.println("\n=== ТЕСТИРОВАНИЕ ЗАВЕРШЕНО ===");
    }
}