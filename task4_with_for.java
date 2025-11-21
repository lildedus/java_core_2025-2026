package lr3;

import java.util.Scanner;

public class task4_with_for {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите 2 числа");
        int a = in.nextInt();
        int b = in.nextInt();
        int max = Math.max(a,b);
        int min = Math.min(a,b);
        for (int i = min; i < max ; i++) {
            System.out.print(i+", ");
        }
        System.out.print(max);
    in.close();
    }
}
/*
4. Напишите программу, в которой пользователем вводится два целых числа.
Программа выводит все целые числа — начиная с наименьшего
(из двух введенных чисел) и заканчивая наибольшим
(из двух введенных чисел). Предложите разные версии программы
(с использованием разных операторов цикла).
*/