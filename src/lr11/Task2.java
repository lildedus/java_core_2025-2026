package lr11;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размер массивов");
        int size = in.nextInt();
        int [] arr1 = new int[size];
        int [] arr2 = new int[size];
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            arr1 [i] = random.nextInt(100);
            arr2 [i] = random.nextInt(100);
        }
        System.out.println("Исходные массивы:");
        System.out.println("arr1:\n" + Arrays.toString(arr1)
                + "\narr2:\n" + Arrays.toString(arr2));
        int [] arrResult = findCommonElements(arr1, arr2);
        System.out.println("Массив с общими числами:");
        System.out.println(Arrays.toString(arrResult));
    }

    public static int [] findCommonElements(int [] arr1, int [] arr2){
        return Arrays.stream(arr1)
                .filter(x -> Arrays.stream(arr2)
                .anyMatch(y -> y == x))
                .toArray();
    }
}
