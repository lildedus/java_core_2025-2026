package lr11;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Task6 {

    public static List<Integer> filterByDivisibility(List<Integer> numbers, int num) {
        return numbers.stream()                           
                .filter(n -> n % num == 0)         
                .collect(Collectors.toList());            
    }

    public static void main(String[] args) {
        List<Integer> nums = List.of(4, 6, 32, 371, 193, 74, 171);
        Scanner in = new Scanner(System.in);
        System.out.println("Введите делитель:");
        int num = in.nextInt();

        List<Integer> result = filterByDivisibility(nums, num);

        System.out.println("Исходный список: " + nums);
        System.out.println("Делитель: " + num);
        System.out.println("Результат: " + result);
    }
}