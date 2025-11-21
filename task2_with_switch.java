package lr3;

import java.util.Scanner;

public class task2_with_switch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите день недели с большой буквы");
        String x = in.nextLine();
        switch (x){
            case "Понедельник" -> System.out.println("Это первый день недели");
            case "Вторник" -> System.out.println("Это второй день недели");
            case "Среда" -> System.out.println("Это третий день недели");
            case "Четверг" -> System.out.println("Это четвертый день недели");
            case "Пятница" -> System.out.println("Это пятый день недели");
            case "Суббота" -> System.out.println("Это шестой день недели");
            case "Воскресенье" -> System.out.println("Это седьмой день недели");
            default -> System.out.println("Такого дня недели не существует!");
        }
    in.close();
    }
}
