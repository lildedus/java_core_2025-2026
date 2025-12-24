package lr6.example4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите число, для которого необходимо вычислить двойной факториал:");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int result = Task4.getNum(num);
        System.out.println("Двойной факториал введенного числа: " + result);
        in.close();
    }
}
