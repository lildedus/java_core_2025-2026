package lr11;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Task4 {
    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>();
        Random random = new Random();
        System.out.println("Исходный список:\n");
        for (int i = 0; i < 10; i++) {
            integers.add(random.nextInt(1000));
            System.out.println(integers.get(i));
        }

        List<Integer> integerList = squareList(integers);
        System.out.println("Список с квадратами чисел:\n");
        for (Integer i: integerList){
            System.out.println(i);
        }
    }

    public static List<Integer> squareList(List<Integer> list){
        return list.stream().map(x -> x * x).collect(Collectors.toList());
    }
}
