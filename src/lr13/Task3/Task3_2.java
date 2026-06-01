package lr13.Task3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task3_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        byte[] a = null;
        int n = 0;
        int sum = 0;
        try {
            System.out.print("n = ");
            n = in.nextInt();
            a = new byte[n];
            for (int i = 0; i < n; i++) {
                System.out.print("a[" + i + "] = ");
                a[i] = in.nextByte();
                sum += a[i];
            }
            System.out.println("Сумма: " + sum);
        } catch (InputMismatchException e) {
            System.out.println("Ошибка: введена строка вместо числа");
        } finally {
            in.close();
        }
    }
}
