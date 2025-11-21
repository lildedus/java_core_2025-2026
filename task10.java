package lr3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class task10 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner in = new Scanner(System.in);
        System.out.println("Введите длину массива:");
        int size = in.nextInt();
        int[] array = new int[size];
        if (size<=0) {
            System.out.println("Ошибка ввода!");
        } else {
            for (int i = 0; i < size; i++) {
                array[i] = random.nextInt(101);
            }
            System.out.println("Массив: " + Arrays.toString(array));
            for (int i = 0; i < size; i++) {
                for (int j = 0; j < size - i - 1; j++) {
                    if (array[j] < array[j + 1]) {
                        int x = array[j];
                        array[j] = array[j + 1];
                        array[j + 1] = x;
                    }
                }
            }
            System.out.println("Отсортированный по убыванию: "+Arrays.toString(array));
        }
        in.close();

    }
}

/*
10. Напишите программу, в которой создается целочисленный
массив, заполняется случайными числами и после этого
значения элементов в массиве сортируются в порядке
убывания значений.
*/