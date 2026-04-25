package lr11;

import java.util.List;
import java.util.stream.Collectors;

public class Task7 {

    public static List<String> filterByLength(List<String> strings, int minLength) {

        return strings.stream()
                .filter(s -> s != null)
                .filter(s -> s.length() > minLength)
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<String> words = List.of("Java", "Python", "C", "Go", "JavaScript", "Rust");
        int minLength = 3;

        List<String> result = filterByLength(words, minLength);

        System.out.println("Исходный список: " + words);
        System.out.println("Минимальная длина: " + minLength);
        System.out.println("Результат: " + result);
    }
}