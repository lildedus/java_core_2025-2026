package lr3;

import java.util.Scanner;

public class task3_with_for {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Сколько будет чисел в последовательности?");
        int size = in.nextInt();
        if (size <= 0){
            System.out.println("Ошибка ввода!");
        } else if (size == 1) {
            System.out.println("1");
        } else if (size == 2) {
            System.out.println("1, 1");
        } else {
            long a = 1, b =1;
            System.out.print("1, 1");
            for (int i = 3; i <= size; i++) {
                long c = a + b;
                System.out.print(", " + c);
                a = b;
                b = c;
            }
        }
    in.close();
    }
}
/*
3. Напишите программу, которая выводит последовательность чисел Фибоначчи.
Первые два числа в этой последовательности равны 1, а каждое следующее число
равно сумме двух предыдущих (получается последовательность 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89 и так далее).
Количество чисел в последовательности вводится пользователем.
Предложите версии программы, использующие разные операторы цикла.
*/