package lr11;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Task8 {

    public static List<Integer> filterGreaterThan(List<Integer> numbers, int min) {

        return numbers.stream()
                .filter(n -> n > min)
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<Integer> nums = List.of(10, 25, 5, 30, 15, 8, 42);
        System.out.println("Введите минимальное значение для списка:");
        Scanner in = new Scanner(System.in);
        int min = in.nextInt();

        List<Integer> result = filterGreaterThan(nums, min);

        System.out.println("Исходный список: " + nums);
        System.out.println("Минимальное значение: " + min);
        System.out.println("Результат: " + result);
    }
}