package lr11;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Task10 {

    public static List<Integer> filterLessThan(List<Integer> numbers, int max) {
        return numbers.stream()
                .filter(n -> n < max)
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<Integer> nums = List.of(10, 25, 5, 30, 15, 8, 42);
        Scanner in = new Scanner(System.in);
        System.out.println("Введите максимальное значение для списка");
        int max = in.nextInt();

        List<Integer> result = filterLessThan(nums, max);

        System.out.println("Исходный список: " + nums);
        System.out.println("Максимальное значение: " + max);
        System.out.println("Результат: " + result);
    }
}