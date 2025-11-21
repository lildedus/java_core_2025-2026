package lr3;

import java.util.Scanner;

public class task2_with_if_else {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите день недели с большой буквы");
        String x = in.nextLine();
        if (x.equals("Понедельник")){
            System.out.println("Это первый день недели");
        } else if (x.equals("Вторник")) {
            System.out.println("Это второй день недели");
        } else if  (x.equals("Среда")){
            System.out.println("Это третий день недели");
        } else if (x.equals("Четверг")){
            System.out.println("Это четвертый день недели");
        } else if (x.equals("Пятница")) {
            System.out.println("Это пятый день недели");
        } else if (x.equals("Суббота")) {
            System.out.println("Это шестой день недели");
        } else if (x.equals("Воскресенье")) {
            System.out.println("Это седьмой день недели");
        } else {
            System.out.println("Такого дня нет!");
        }
    in.close();
    }
}


/*
2. Напишите программу, в которой пользователю предлагается ввести
название дня недели. По введенному названию программа определяет
порядковый номер дня в неделе. Если пользователь вводит неправильное
название дня, программа выводит сообщение о том, что такого дня нет.
Предложите версию программы на основе вложенных условных операторов
и на основе оператора выбора switch.
*/