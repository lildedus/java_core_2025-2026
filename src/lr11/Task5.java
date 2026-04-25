package lr11;

import java.util.List;
import java.util.stream.Collectors;

public class Task5 {

    public static List<String> filterBySubstring(List<String> strings, String substring) {

        return strings.stream()
                .filter(s -> s.contains(substring))
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<String> words = List.of("Kotlin", "Java", "JavaScript", "Python", "Rust","TypeScript");
        String search = "Java";

        List<String> result = filterBySubstring(words, search);

        System.out.println("Исходный список: " + words);
        System.out.println("Искомая подстрока: \"" + search + "\"");
        System.out.println("Результат: " + result);
    }
}