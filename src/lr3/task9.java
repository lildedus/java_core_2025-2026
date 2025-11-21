package lr3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class task9 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner in = new Scanner(System.in);
        System.out.println("Введите длину массива:");
        int size = in.nextInt();
        int[] array = new int[size];
        if (size <= 0) {
            System.out.println("Ошибка ввода!");
        } else {
            for (int i = 0; i < size; i++) {
                array[i] = random.nextInt(101);
            }
            System.out.println("Массив:\n" + Arrays.toString(array));
            int min = array[0];
            for (int i = 1; i < size; i++) {
                if (array[i] < min) {
                    min = array[i];
                }
            }
            System.out.println("Минимальное значение = " + min);
            System.out.print("Индекс: ");
            for (int i = 0; i < size; i++) {
                if (array[i]==min){
                    System.out.print(i +" ");
                }
            }

        }
        in.close();
    }
}
/*
9. Напишите программу, в которой создается массив и заполняется
случайными числами. Массив отображается в консольном окне.
В этом массиве необходимо определить элемент с минимальным значением.
В частности, программа должна вывести значение элемента с минимальным
значением и индекс этого элемента. Если элементов с минимальным
значением несколько, должны быть выведены индексы всех этих элементов.
*/