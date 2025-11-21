package lr3;

import java.util.Random;
import java.util.Scanner;

public class task5_with_do_while {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Введите кол-во чисел для обработки:");
        int size = in.nextInt();
        int count = 0, sum = 0;
        if (size<=0) {
            System.out.println("Ошибка ввода!");
        } else {
            System.out.println("Найденные числа:");
            do {
                int randomNumber = random.nextInt(100);
                    if ((randomNumber%5==2)||(randomNumber%3==1)) {
                    System.out.print(randomNumber+", ");
                    count++;
                    sum+=randomNumber;
                    }
                } while (count<size);
            }
            System.out.println("\nСумма: "+ sum);
    in.close();
    }
}
