package lr13.Task2;

import java.util.Scanner;

public class Task2_2 {
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

            if (col < 0 || col >= m[0].length) {
                throw new ArrayIndexOutOfBoundsException("Нет столбца с номером " + col);
            }
            for (int i = 0; i < m.length; i++) {
                System.out.println(m[i][col]);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Ошибка: " + e.getMessage());
        } finally {
            in.close();
        }
    }
}