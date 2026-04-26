package lr11;

import java.util.List;
import java.util.stream.Collectors;

public class Task3 {
    public static void main(String[] args) {
        String string = "Напишите функцию, которая принимает на Вход список строк " +
                "и Возвращает новый Список, Содержащий только те строки, " +
                "Которые начинаются С большой Буквы";
        List<String> strings = List.of(string.split(" "));
        System.out.println("Строка после сплита:\n");
        for (String e : strings){
            System.out.println(e);
        }

        List<String> stringList = filterCapitalizedStrings(strings);
        System.out.println("\n" + "Строка после преобразования:\n");
        for (String e : stringList){
            System.out.println(e);
        }

    }
    public static List<String> filterCapitalizedStrings(List<String> list){
        return list.stream()
                .filter(x -> Character.isUpperCase(x.charAt(0)))
                .collect(Collectors.toList());
    }
}
