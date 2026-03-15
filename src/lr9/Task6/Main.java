package lr9.Task6;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();

        map.put(1, "Кружка");
        map.put(2, "Карандаш");
        map.put(3, "Пульт");
        map.put(4, "Телефон");
        map.put(5, "Часы");
        map.put(6, "Полка");
        map.put(7, "Ключи");
        map.put(8, "Коробка");
        map.put(9, "Лампа");
        map.put(10, "Камера");

        System.out.println("Исходный HashMap:");
        System.out.println(map);
        System.out.println();

        System.out.println("Строки с ключом > 5:");
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            if (entry.getKey() > 5) {
                System.out.println("Ключ: " + entry.getKey() + ", Значение: " + entry.getValue());
            }
        }
        System.out.println();

        map.put(0, "Нулевой элемент");
        System.out.println("Строки с ключом = 0 (через запятую):");
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            if (entry.getKey() == 0) {
                System.out.println(entry.getValue());
            }
        }
        System.out.println();

        long product = 1;
        boolean found = false;

        System.out.println("Ключи, где длина строки > 5:");
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            String value = entry.getValue();
            int key = entry.getKey();
            if (value.length() > 5) {
                if (key != 0){
                    product *= key;
                }
                found = true;
                System.out.println("Ключ: " + key + ", Значение: '" + value + "', Длина: " + value.length());
            }
        }

        if (found) {
            System.out.println("Произведение ключей (где длина строки > 5): " + product);
        } else {
            System.out.println("Нет строк с длиной > 5");
        }
    }
}