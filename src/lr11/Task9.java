package lr11;

import java.util.List;
import java.util.stream.Collectors;

public class Task9 {

    public static List<String> filterOnlyLetters(List<String> strings) {
        return strings.stream()
                .filter(s -> s.matches("[a-zA-Zа-яёА-ЯЁ]+"))
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<String> words = List.of("Hello", "World123", "Привет", "Java8", "Python!", "Code");

        List<String> result = filterOnlyLetters(words);

        System.out.println("Исходный список: " + words);
        System.out.println("Результат: " + result);
    }
}