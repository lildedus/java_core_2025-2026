package lr13.Task2;

import java.util.InputMismatchException;
import java.util.Scanner;
public class Task2_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] m = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        try {
            System.out.print("col = ");
            int col = in.nextInt();

            for (int i = 0; i < m.length; i++) {
                System.out.println(m[i][col]);
            }
        } catch (InputMismatchException e) {
            System.out.println("Ошибка: введена строка вместо числа");
        } finally {
            in.close();
        }
    }
}