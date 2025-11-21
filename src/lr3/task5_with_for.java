package lr3;

import java.util.Random;
import java.util.Scanner;

public class task5_with_for {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Введите кол-во чисел");
        int size = in.nextInt();
        int sum = 0;
        int count = 0;
        if (size<=0){
            System.out.println("Ошибка ввода!");
        } else {
            System.out.println("Подходящие числа:");
            for (int i = 0; count < size; i++) {
                int randomNumber = random.nextInt(101);
                if (((randomNumber % 5) == 2) || ((randomNumber % 3) == 1)) {
                    sum += randomNumber;
                    System.out.print(randomNumber + ", ");
                    count++;
                }
            }
            System.out.println("\nСумма: " + sum);
        }
        in.close();
    }
}
/*
5. Напишите программу, в которой вычисляется сумма чисел,
удовлетворяющих таким критериям: при делении числа на 5
в остатке получается 2, или при делении на 3 в остатке
получается 1. Количество чисел в сумме вводится пользователем.
Программа отображает числа, которые суммируются, и значение суммы.
Предложите версии программы, использующие разные операторы цикла.
*/