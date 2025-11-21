package lr3;

import java.util.Random;
import java.util.Scanner;

public class task5_with_while {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Введите кол-во чисел");
        int size = in.nextInt();
        int count = 0;
        int sum = 0;
        if (size<=0){
            System.out.println("Ошибка ввода!");
        } else {
            System.out.println("Подходящие числа:");
            while (count < size) {
                int randomNumber = random.nextInt(101);
                if ((randomNumber % 5 == 2) || (randomNumber % 3 == 1)) {
                    System.out.print(randomNumber + ", ");
                    count++;
                    sum += randomNumber;
                }
            }
            System.out.println("\nСумма: "+sum);
        }
        in.close();
    }
}
